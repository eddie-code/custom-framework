package demo.pattern.factory.abstractf;

import demo.pattern.factory.pojo.KeyBoard;
import demo.pattern.factory.pojo.Mouse;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.abstractf
 * @ClassName AbstractFactoryDemo
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 22:16
 * @modified by
 */
/*抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
    优点：支持多类产品的创建
    缺点：违反开闭原则、增加系统复杂度
* */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        ComputerFactory hpFactory = new HpComputerFactory();
        Mouse hpMouse = hpFactory.createMouse();
        KeyBoard hpKeyBoard = hpFactory.createKeyBoard();
        hpMouse.sayHi();
        hpKeyBoard.sayHello();
    }

}

