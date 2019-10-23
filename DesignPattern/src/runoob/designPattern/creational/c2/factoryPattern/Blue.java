package runoob.designPattern.creational.c2.factoryPattern;

//步骤4.创建实现接口的实现类。
public class Blue implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Blue: fill() method.");		
	}

}
