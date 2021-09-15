package demo.generic;

import java.util.Random;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.generic
 * @ClassName RobotFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 13:51
 * @modified by
 */
public class RobotFactory implements GenericFactory<String, Integer>{

    /**
     * 定义成员变量
     */
    private String[] stringRobot = new String[]{"Hello","Hi"};
    private Integer[] integerRobot = new Integer[]{111,000};

    @Override
    public String nextObject() {
        Random random = new Random();
        return stringRobot[random.nextInt(2)];
    }

    @Override
    public Integer nextNumber() {
        Random random = new Random();
        return integerRobot[random.nextInt(2)];
    }

    public static void main(String[] args) {
        GenericFactory<String, Integer> factory = new RobotFactory();
        System.out.println(factory.nextObject());
        System.out.println(factory.nextNumber());
    }


}
