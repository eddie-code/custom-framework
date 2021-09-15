package demo.pattern.factory.method;

import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.method
 * @ClassName FactoryMethodDemo
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 20:36
 * @modified by
 */
/*
 * 工厂方法模式
 *      优点：遵循开闭原则、单一职责原则、对客户端隐藏对象的实现细节
 *      缺点：
 *          1.只支持同一类产品的创建
 *          2.改动成本较大、不适合进行扩展
 */
public class FactoryMethodDemo {
	public static void main(String[] args) {
		IBMMouseFactory ibmMouseFactory = new IBMMouseFactory();
		Mouse mouse = ibmMouseFactory.createMouse();
		mouse.sayHi();
	}
}
