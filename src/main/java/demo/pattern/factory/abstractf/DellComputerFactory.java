package demo.pattern.factory.abstractf;

import demo.pattern.factory.pojo.DellKeyBoard;
import demo.pattern.factory.pojo.DellMouse;
import demo.pattern.factory.pojo.KeyBoard;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.abstractf
 * @ClassName DellComputerFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 22:16
 * @modified by
 */
public class DellComputerFactory implements ComputerFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
