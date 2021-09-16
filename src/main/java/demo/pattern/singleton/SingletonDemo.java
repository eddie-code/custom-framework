package demo.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLOutput;


/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.singleton
 * @ClassName SingletonDemo
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-16 23:41
 * @modified by
 */
public class SingletonDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 对比直接获取的单例实例与反射得到的单例实例，是否一致   （答案：No）
        System.out.println(StarvingSingleton.getInstance());
        Class clazz = StarvingSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance());

        // 对比直接获取的单例实例与反射得到的单例实例，是否一致   （答案：No）
        System.out.println(LazyDoubleCheckSingleton.getInstance());
        Class clazz1 = LazyDoubleCheckSingleton.class;
        Constructor constructor1 = clazz1.getDeclaredConstructor();
        constructor1.setAccessible(true);
        System.out.println(constructor1.newInstance());
    }

}
