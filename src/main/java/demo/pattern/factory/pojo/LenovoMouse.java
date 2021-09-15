package demo.pattern.factory.pojo;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.pojo
 * @ClassName LenovoMouse
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:59
 * @modified by
 */
public class LenovoMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是联想鼠标");
    }
}
