package org.simpleframework.core;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.simpleframework.core.annotation.Component;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.core.annotation.Resipotory;
import org.simpleframework.core.annotation.Service;
import org.simpleframework.util.ClassUtil;
import org.simpleframework.util.ValidationUtil;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package org.simpleframework.core.annotation
 * @ClassName BeanContainer
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-17 10:20
 * @modified by
 */
@Slf4j
// 私有的无参构造
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BeanContainer {

	/**
	 * 存放所有被配置标记的目标对象的Map
	 */
	private final Map<Class<?>, Object> beanMap = new ConcurrentHashMap();

	/**
	 * 加载Bean的注解列表
	 */
	private static final List<Class<? extends Annotation>> BEAN_ANNOTATION = Arrays.asList(Component.class,
			Controller.class, Resipotory.class, Service.class);

	/**
	 * 扫描加载所有Bean
	 */
	public synchronized void loadBeans(String packageName) {
		//判断bean容器是否被加载过
		if(isLoaded()){
			System.out.println("【WARN】BeanContainer has been loaded");
			return;
		}
		Set<Class<?>> classSet = ClassUtil.extractPackageClass(packageName);
		//新建一个验证工具类ValidationUtil用于字符串、数组等的判空校验
		if(ValidationUtil.isEmpty(classSet)){
			System.out.println("【WARN】extract nothing from packageName" + packageName);
			return;
		}
		for (Class clazz:classSet) {
			for (Class<? extends Annotation> annotation: BEAN_ANNOTATION) {
				//如果类上面标记了定义的注解
				if(clazz.isAnnotationPresent(annotation))
					//将目标类本身作为键，目标类的实例作为值，放入到beanMap中,定义一个newInstance方法用于通过反射初始化对象
					beanMap.put(clazz, ClassUtil.newInstance(clazz,true));
			}
		}
		loaded = true;
	}

	// 枚举单例
	private enum ContaineHolder {
		INSTANCE;

		private BeanContainer instance;

		ContaineHolder() {
			instance = new BeanContainer();
		}
	}

	/**
	 * 获取Bean容器实力
	 * 
	 * @return
	 */
	public static BeanContainer getInstance() {
		return ContaineHolder.INSTANCE.instance;
	}

	//是否加载过bean
	private boolean loaded = false;

	public boolean isLoaded() {
		return loaded;
	}
	//bean实例数量
	public int size() {
		return beanMap.size();
	}


}
