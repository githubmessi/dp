package runoob.designPattern.creational.c1.factoryPattern;

//步骤4.通过传递类型信息来获取实体类的对象。
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUare");
		shape3.draw();

	}

}
