package runoob.designPattern.structural.s5.decoratorPattern;

//步骤5：使用RedShapeDecorator来装饰shape对象。
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with: normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		System.out.println("\nCircle of red border");
		redRectangle.draw();
	}

}
