package demo.pattern.factory.pojo;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.pojo
 * @ClassName LenovoKeyBoard
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 21:17
 * @modified by
 */
public class LenovoKeyBoard implements KeyBoard {

    @Override
    public void sayHello() {
        System.out.println("我是联想键盘");
    }
}
