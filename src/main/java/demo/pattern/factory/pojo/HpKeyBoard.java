package demo.pattern.factory.pojo;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.pojo
 * @ClassName HpKeyBoard
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 21:18
 * @modified by
 */
public class HpKeyBoard implements KeyBoard {

    @Override
    public void sayHello() {
        System.out.println("我是惠普键盘");
    }
}
