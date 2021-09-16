package demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.annotation
 * @ClassName CourseInfoAnnotation
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 11:05
 * @modified by
 */
// FIELD 作用域类的成员变量之上，METHOD 作用域类的方法之上
@Target({ ElementType.TYPE, ElementType.METHOD })
// RUNTIME 运行时才能获取
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseInfoAnnotation {

	// 课程名称
	String courseName();

	// 课程标签
	String courseTag();

	// 课程简介
	String courseProfile();

	// 课程序号
	int courseIndex() default 303;
}
