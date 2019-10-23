package structural.decorator.learn5;

public class DecoratorPatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape5 circle = new Circle5();
		circle.draw();
		Shape5 rectangle = new Rectangle5();
		rectangle.draw();
		Shape5 decoratorCircle = new BlueShape5Decorator(circle);
		decoratorCircle.draw();
		
	}

}
