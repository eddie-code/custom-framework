package demo.generic;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.generic
 * @ClassName GenericFactory
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 13:50
 * @modified by
 */
public interface GenericFactory<T, N> {

	/**
	 * T
	 * 
	 * @return
	 */
	T nextObject();

	/**
	 * N
	 * 
	 * @return
	 */
	N nextNumber();
}
