package demo.pattern.factory.method;

import demo.pattern.factory.pojo.HpMouse;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.method
 * @ClassName HpMouseFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 20:35
 * @modified by
 */
public class HpMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
