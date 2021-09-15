package demo.pattern.factory.simple;

import demo.pattern.factory.pojo.DellMouse;
import demo.pattern.factory.pojo.HpMouse;
import demo.pattern.factory.pojo.LenovoMouse;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.simple
 * @ClassName MouseFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 19:57
 * @modified by
 */
/*
 * 简单工厂使用场景： 1. 需要创建的对象较少
 *                  2. 客户端不关心对象的创建过程 优点：对客户端隐藏相关细节
 *
 * 缺点：1. 因创建逻辑复杂或创建对象过多导致代码臃肿
 *       2. 新增、删除子类均违反开闭原则 开闭原则：一个软件实体（类、模块、方法），应该对扩展开放，对修改关闭
 */
public class MouseFactory {
	public static Mouse createMouse(int type) {
		switch (type) {
		case 0:
			return new DellMouse();
		case 1:
			return new HpMouse();
		case 2:
			return new LenovoMouse();// 如果在原有基础上添加LenovoMouse()，就“违反开闭原则”
		default:
			return new DellMouse();
		}
	}

	public static void main(String[] args) {
		Mouse mouse = MouseFactory.createMouse(2);
		mouse.sayHi();
	}
}
