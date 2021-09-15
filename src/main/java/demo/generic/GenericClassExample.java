package demo.generic;

import lombok.Data;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.generic
 * @ClassName GenericClassExample
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 11:24
 * @modified by
 */
@Data
public class GenericClassExample<T> {

	/**
	 * member 这个成员变量的类型为 T T的类型由外部指定
	 */
	private T member;

	/**
	 * 泛型构造方法形参member的类型也为T，T的类型由外部指定
	 * 
	 * @param member
	 */
	public GenericClassExample(T member) {
		this.member = member;
	}

	public T headSomething(T target) {
		return target;
	}

	public String sayHello(String name) {
		return "hello, " + name;
	}

	/**
	 * E 不受制于 GenericClassExample的泛型 T
	 * 上述的都是受制于 T
	 */
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s", element);
			System.out.print(" ");
		}
		System.out.println();
	}

}
