package org.simpleframework.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package org.simpleframework.core.annotation
 * @ClassName Component
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 16:28
 * @modified by
 */
// TYPE只作用域类上
@Target(ElementType.TYPE)
// 运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
}
