package demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.annotation
 * @ClassName PersonInfoAnnotation
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 11:00
 * @modified by
 */
// FIELD 作用域类的成员变量之上
@Target(ElementType.FIELD)
// RUNTIME 运行时才能获取
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonInfoAnnotation {

	// 名字
	String name();

	// 年龄
	int age() default 20;

	// 性别
	String gender() default "男";

	// 开发语言
	String[] language();

}
