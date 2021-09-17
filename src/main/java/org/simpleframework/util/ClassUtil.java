package org.simpleframework.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package org.simpleframework.util
 * @ClassName ClassUtil
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 16:35
 * @modified by
 */
@Slf4j
public class ClassUtil {

	public static final String FILE_PROTOCOL = "file";

	/**
	 * 获取包下类集合
	 *
	 * extractPackageClass 方法作用： <br>
	 * 1. 获取到类的加载器 <br>
	 * 2. 通过类加载器获取到加载的资源信息 <br>
	 * 3. 依据不同的资源类型，采用不同的方式获取资源的集合
	 *
	 * @param packageName
	 *            包名称
	 */
	public static Set<Class<?>> extractPackageClass(String packageName) {
		// 1. 获取到类的加载器
		ClassLoader classLoader = getClassLoader();
		// 2. 通过类加载器获取到加载的资源信息  com.example.pojo  ==>  com/example/pojo
		URL url = classLoader.getResource(packageName.replace(".", "/"));
		if (url == null) {
			// log.warn("unable to retrieve anything from package: " + packageName);
			System.err.println("unable to retrieve anything from package: " + packageName);
		}
		// 3. 依据不同的资源类型，采用不同的方式获取资源的集合
		Set<Class<?>> classSet = null;
		// 过滤出文件类型的资源
		if (url.getProtocol().equalsIgnoreCase(FILE_PROTOCOL)) {
			classSet = new HashSet<Class<?>>();
			File packageDirectory = new File(url.getPath());
			extractClassFile(classSet, packageDirectory, packageName);

		}
		return classSet;
	}

	/**
	 * 获取ClassLoader实例
	 * 
	 * @return 当前classloader
	 */
	public static ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	/**
	 * 递归获取目标package里面的所有class文件(包括子package里的class文件)
	 *
	 * @param emptyClassSet
	 *            装载目标类的集合
	 * @param fileSource
	 *            目录
	 * @param packageName
	 *            包名
	 * @return 类集合
	 */
	private static void extractClassFile(Set<Class<?>> emptyClassSet, File fileSource, String packageName) {
		if (!fileSource.isDirectory()) {
			return;
		}
		// 如果是一个文件夹，则调用其listFiles方法获取文件夹下的文件或文件夹
		File[] files = fileSource.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				if (file.isDirectory()) {
					return true;
				} else {
					// 获取文件的绝对值路径
					String absoluteFilePath = file.getAbsolutePath();
					if (absoluteFilePath.endsWith(".class")) {
						// 若是class文件，则直接加载
						addToClassSet(absoluteFilePath);
					}
				}
				return false;
			}

			//根据class文件的绝对值路径，获取并生成class对象，并放入classSet中
			private void addToClassSet(String absoluteFilePath) {
				//1.从class文件的绝对值路径里提取出包含了package的类名
				//如/Users/baidu/example/springframework/sampleframework/target/classes/com/example/entity/dto/MainPageInfoDTO.class
				//需要弄成com.example.entity.dto.MainPageInfoDTO
				absoluteFilePath = absoluteFilePath.replace(File.separator, ".");
				String className = absoluteFilePath.substring(absoluteFilePath.indexOf(packageName));
				className = className.substring(0, className.lastIndexOf("."));
				//2.通过反射机制获取对应的Class对象并加入到classSet里
				Class targetClass = loadClass(className);
				emptyClassSet.add(targetClass);
			}
		});

		if (files != null) {
			for (File f : files) {
				// 递归调用
				extractClassFile(emptyClassSet, f, packageName);
			}
		}
	}

	/**
	 * 获取Class对象
	 *
	 * @param className
	 *            class全名=package + 类名
	 * @return Class
	 */
	public static Class<?> loadClass(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			// log.error("load class error:", e);
			System.out.println("load class error:" + e);
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.example.pojo");
		for (Class clazz : classSet) {
			System.out.println(clazz);
		}
	}

	/**
	 * 实例化class
	 *
	 * @param clazz Class
	 * @param <T>   class的类型
	 * @param accessible   是否支持创建出私有class对象的实例
	 * @return 类的实例化
	 */
	public static <T> T newInstance(Class<?> clazz, boolean accessible){
		try {
			Constructor constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(accessible);
			return (T)constructor.newInstance();
		} catch (Exception e) {
			//log.error("newInstance error", e);
			System.out.println("newInstance error"+ e);
			throw new RuntimeException(e);
		}
	}

}
