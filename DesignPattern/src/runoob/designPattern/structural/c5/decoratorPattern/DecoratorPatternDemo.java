package runoob.designPattern.structural.c5.decoratorPattern;

//步骤5：使用RedShapeDecorator类来装饰Shape对象
public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		RedShapeDecorated redCircle = new RedShapeDecorated(new Circle());
		RedShapeDecorated redRectangle = new RedShapeDecorated(new Rectangle());
		
		System.out.println("Circle with normal border.");
		circle.draw();
		
		System.out.println("\ncircle with red border.");
		redCircle.draw();
		
		System.out.println("\nrectangle with red border.");
		redRectangle.draw();
	}

}
