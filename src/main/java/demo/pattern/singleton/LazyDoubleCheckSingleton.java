package demo.pattern.singleton;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.singleton
 * @ClassName LazyDoubleCheckSingleton
 * @blog blog.eddilee.cn
 * @description 懒汉模式 <br>
 *              在被客户端首次调用的时候才创建唯一实例 <br>
 *              加入双重检查锁机制懒汉模式能确保线程安全
 * @date created in 2021-09-16 23:41
 * @modified by
 */
public class LazyDoubleCheckSingleton {

	/**
	 * volatile 类型修饰符 <br>
	 * 它用于修饰不同线程访问和修改的变量，可以被异步的线程锁修改
	 */
	private volatile static LazyDoubleCheckSingleton instance;

	private LazyDoubleCheckSingleton() {

	}

	public static LazyDoubleCheckSingleton getInstance() {
		// 第一次检查
		if (instance == null) {
			// 同步
			synchronized (LazyDoubleCheckSingleton.class) {
                // 第二次检查
				if (instance == null) {
					instance = new LazyDoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}
