package demo.pattern.singleton;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.singleton
 * @ClassName StarvingSingleton
 * @blog blog.eddilee.cn
 * @description 饿汉模式 <br>
 *              类被加载的时候就立即初始化并创建唯一实例
 * @date created in 2021-09-16 23:39
 * @modified by
 */
public class StarvingSingleton {

	/**
	 *  final 在这里作用域 不能被修改
	 */
	private static final StarvingSingleton instance = new StarvingSingleton();

	private StarvingSingleton() {

	}

	public static StarvingSingleton getInstance() {
		return instance;
	}

}
