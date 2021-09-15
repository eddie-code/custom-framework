package demo.pattern.factory.pojo;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package demo.pattern.factory.pojo
 * @ClassName IBMMouse
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 20:38
 * @modified by
 */
public class IBMMouse implements Mouse {

    @Override
    public void sayHi() {
        System.out.println("我是lenovo旗下的IBM鼠标");
    }
}
