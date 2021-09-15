package demo.pattern.factory.pojo;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.pojo
 * @ClassName DellMouse
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:56
 * @modified by
 */
public class DellMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是戴尔鼠标");
    }
}