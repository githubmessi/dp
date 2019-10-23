package runoob.designPattern.structural.s5.decoratorPattern;

//步骤2：创建实现接口的实体类。
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}

}
