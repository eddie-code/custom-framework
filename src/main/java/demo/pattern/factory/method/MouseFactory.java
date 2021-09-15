package demo.pattern.factory.method;

import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.method
 * @ClassName MouseFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 20:34
 * @modified by
 */
public interface MouseFactory {

	/**
	 * 创建鼠标
	 * 
	 * @return
	 */
	Mouse createMouse();
}
