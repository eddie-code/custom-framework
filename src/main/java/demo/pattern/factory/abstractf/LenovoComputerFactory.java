package demo.pattern.factory.abstractf;

import demo.pattern.factory.pojo.KeyBoard;
import demo.pattern.factory.pojo.LenovoKeyBoard;
import demo.pattern.factory.pojo.LenovoMouse;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.abstractf
 * @ClassName LenovoComputerFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 22:17
 * @modified by
 */
public class LenovoComputerFactory implements ComputerFactory {

    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new LenovoKeyBoard();
    }
}
