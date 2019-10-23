package structural.decorator.learn2;

public abstract class AbstractShapeDecorator implements Shape{
	
	protected Shape shapeDecorated;

	public AbstractShapeDecorator(Shape shapeDecorated) {
		super();
		this.shapeDecorated = shapeDecorated;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shapeDecorated.draw();
	}

}
