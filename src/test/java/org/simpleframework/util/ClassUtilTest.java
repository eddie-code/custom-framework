package org.simpleframework.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package org.simpleframework.util
 * @ClassName ClassUtilTest
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 23:24
 * @modified by
 */
public class ClassUtilTest {

    @DisplayName("提取目标类方法：extractPackageClassTest")
	@Test
	public void extractPackageClassTest() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.example.pojo");
        for (Class clazz : classSet) {
            System.out.println(clazz);
        }
        Assertions.assertEquals(6, classSet.size());

    }

}
