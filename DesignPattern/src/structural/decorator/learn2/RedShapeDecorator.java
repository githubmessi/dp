package structural.decorator.learn2;

public class RedShapeDecorator extends AbstractShapeDecorator{

	public RedShapeDecorator(Shape shapeDecorated) {
		super(shapeDecorated);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(){
		shapeDecorated.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		// TODO Auto-generated method stub
		System.out.println("red border");
	}

}
