package demo.pattern.factory.abstractf;

import demo.pattern.factory.pojo.KeyBoard;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.abstractf
 * @ClassName ComputerFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 22:15
 * @modified by
 */
public interface ComputerFactory {

    Mouse createMouse();

    KeyBoard createKeyBoard();
}
