package org.simpleframework.util;

import lombok.extern.slf4j.Slf4j;

import java.net.URL;
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

	/**
	 * 获取包下类集合
     *
     * extractPackageClass 方法作用：
     *  1. 获取到类的加载器
     *  2. 通过类加载器获取到加载的资源信息
     *  3. 依据不同的资源类型，采用不同的方式获取资源的集合
     *
	 * @param packageName 包名称
	 */
	public static Set<Class<?>> extractPackageClass(String packageName) {
	    // 1. 获取到类的加载器
        ClassLoader classLoader = getClassLoader();
        // 2. 通过类加载器获取到加载的资源信息
        URL url = classLoader.getResource(packageName.replace(".", "/"));
        if (url == null) {
            //log.warn("unable to retrieve anything from package: " + packageName);
            System.err.println("unable to retrieve anything from package: " + packageName);
        }
        // 3. 依据不同的资源类型，采用不同的方式获取资源的集合
		return null;
	}

    /**
     * 获取ClassLoader实例
     * @return 当前classloader
     */
	public static ClassLoader getClassLoader() {
	   return Thread.currentThread().getContextClassLoader();
    }

}
