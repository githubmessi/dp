package structural.decorator.learn3;

public class MainDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		System.out.println("==");
		ShapeDecorator redShape = new RedShapeDecorator(new Circle());
		redShape.draw();
		System.out.println("==");
		ShapeDecorator redTriangle = new RedShapeDecorator(new Triangle());
		redTriangle.draw();
	}
}
