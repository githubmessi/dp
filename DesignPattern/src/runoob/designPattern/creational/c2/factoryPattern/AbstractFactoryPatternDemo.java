package runoob.designPattern.creational.c2.factoryPattern;

//步骤8：使用FactoryProducer来获取AbstractFactory，通过传递类型信息来获取实体类的对象。
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
		
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
		
		Color color2 = colorFactory.getColor("green");
		color2.fill();
		
		Color color3 = colorFactory.getColor("blue");
		color3.fill();
		
	}
}
