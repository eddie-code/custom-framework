package demo.pattern.factory.method;

import demo.pattern.factory.pojo.DellMouse;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.method
 * @ClassName DellMouseFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 20:36
 * @modified by
 */
public class DellMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
