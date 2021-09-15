package demo.generic;

import java.util.LinkedList;
import java.util.List;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.generic
 * @ClassName GeneraicDemo
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 11:18
 * @modified by
 */
public class GeneraicDemo {

	/**
	 * 通配符 ？
	 */
//	public static void handMember(GenericClassExample<?> genericClassExample){
	/**
	 * 泛型加入上边界 ? extends E
	 */
//	public static void handMember(GenericClassExample<? extends Integer> genericClassExample){
	/**
	 * 泛型加入下边界 ? super E
	 */
	public static void handMember(GenericClassExample<? super Integer> genericClassExample){
		Integer integer = 123 + (Integer) genericClassExample.getMember();
		System.out.println("Integer is " + integer);
	}

	public static void main(String[] args) {
		GenericClassExample<String> stringGenericClassExample = new GenericClassExample<>("abc");
		System.out.println(stringGenericClassExample.getMember().getClass());

//		GenericClassExample<Integer> integerGenericClassExample = new GenericClassExample<>(123);
		GenericClassExample<Number> numberGenericClassExample = new GenericClassExample<>(123);
//		System.out.println(integerGenericClassExample.getMember().getClass());

		String s = stringGenericClassExample.headSomething("abc");
		System.out.println(s);

//		Integer i = integerGenericClassExample.headSomething(123);
//		System.out.println(i);

//		String sayHello = integerGenericClassExample.sayHello("eddie");
//		System.out.println(sayHello);

		handMember(numberGenericClassExample);

		Integer[] integers = {1, 2, 3, 4, 5, 6};
		Double[] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] characters = {'A', 'B', 'C'};
		GenericClassExample.printArray(integers);
		GenericClassExample.printArray(doubles);
		GenericClassExample.printArray(characters);

	}

}
