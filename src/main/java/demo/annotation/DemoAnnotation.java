package demo.annotation;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.annotation
 * @ClassName DemoAnnotation
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 11:34
 * @modified by
 */
public class DemoAnnotation {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.getCourseInfo();
        System.out.println("x");
        // 自定义注解并没有任何作用
    }

}
