package demo.pattern.factory.abstractf;

import demo.pattern.factory.pojo.HpKeyBoard;
import demo.pattern.factory.pojo.HpMouse;
import demo.pattern.factory.pojo.KeyBoard;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.abstractf
 * @ClassName HpComputerFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 22:16
 * @modified by
 */
public class HpComputerFactory implements ComputerFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
