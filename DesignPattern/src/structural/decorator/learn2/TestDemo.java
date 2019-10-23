package structural.decorator.learn2;

public class TestDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		System.out.println("==");
		Shape redCircle = new RedShapeDecorator(circle);
		redCircle.draw();
		System.out.println("==");
		Shape redTriangle = new RedShapeDecorator(new Triangle());
		redTriangle.draw();
	}
}
