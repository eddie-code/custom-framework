package demo.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.singleton
 * @ClassName EnumStarvingSingleton
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-17 9:45
 * @modified by
 */
public class EnumStarvingSingleton {

	private EnumStarvingSingleton() {
	}

	public static EnumStarvingSingleton getInstance() {
		return InnerEnum.INSTANCE.instance;
	}

	private enum InnerEnum {
		INSTANCE;

		private EnumStarvingSingleton instance;

		InnerEnum() {
			instance = new EnumStarvingSingleton();
		}
	}

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// Constructor constructor = InnerEnum.class.getDeclaredConstructor();
		Constructor constructor = InnerEnum.class.getDeclaredConstructor(String.class, int.class);
		constructor.setAccessible(true);
		System.out.println(EnumStarvingSingleton.getInstance()); // 无法反射式创建枚举对象
		System.out.println(constructor.newInstance());
	}
}
