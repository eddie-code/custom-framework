package demo.pattern.factory.method;

import demo.pattern.factory.pojo.LenovoMouse;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.method
 * @ClassName LenovoMouseFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 20:35
 * @modified by
 */
public class LenovoMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
