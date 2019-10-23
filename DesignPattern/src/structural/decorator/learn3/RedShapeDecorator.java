package structural.decorator.learn3;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		// TODO Auto-generated method stub
		System.out.println("red border.");
	}

}
