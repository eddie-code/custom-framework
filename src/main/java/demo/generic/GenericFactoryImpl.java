package demo.generic;

import java.util.Random;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.generic
 * @ClassName GenericFactoryImpl
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 13:56
 * @modified by
 */
public class GenericFactoryImpl<T,N> implements GenericFactory<T,N> {

    /**
     * 定义成员变量
     */
    private String[] stringRobot = new String[]{"Hello","Hi"};
    private Integer[] integerRobot = new Integer[]{111,000};

    @Override
    public T nextObject() {
        Random random = new Random();
        return (T) stringRobot[random.nextInt(2)];
    }

    @Override
    public N nextNumber() {
        Random random = new Random();
        return (N) integerRobot[random.nextInt(2)];
    }

    public static void main(String[] args) {
        GenericFactory<String, Integer> factory = new GenericFactoryImpl();
        System.out.println(factory.nextObject());
        System.out.println(factory.nextNumber());
    }
}
