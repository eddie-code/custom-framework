package demo.pattern.factory.pojo;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.pojo
 * @ClassName HpMouse
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:58
 * @modified by
 */
public class HpMouse  implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是惠普鼠标");
    }
}
