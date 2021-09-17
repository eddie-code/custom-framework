package org.simpleframework.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package org.simpleframework.core
 * @ClassName BeanContainerTest
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-17 11:41
 * @modified by
 */
public class BeanContainerTest {

    private static BeanContainer beanContainer;

    /**
     * @BeforeAll 在时候 junit 前会进行一次初始化
     */
    @BeforeAll
    static void init() {
        beanContainer = BeanContainer.getInstance();
    }

    @DisplayName("加载目标类以及其实例到BeanContainer：loadBeansTest")
    @Test
    public void loadBeansTest() {
        Assertions.assertEquals(false, beanContainer.isLoaded());
        beanContainer.loadBeans("com.example");
        Assertions.assertEquals(6, beanContainer.size());
        Assertions.assertEquals(true, beanContainer.isLoaded());
    }

}
