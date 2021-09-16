package demo.annotation;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.annotation
 * @ClassName Demo
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 11:28
 * @modified by
 */
@CourseInfoAnnotation(courseName = "Java直通车", courseTag = "面试必备", courseProfile = "Java, Spring, sql")
public class Demo {

	@PersonInfoAnnotation(name = "eddie", language = { "java", "c++", "go" })
	private String author;

    @CourseInfoAnnotation(courseName = "求其所好", courseTag = "实战必备", courseProfile = "基于SpringCloud搭建的分布式框架")
	public void getCourseInfo() {

	}

}
