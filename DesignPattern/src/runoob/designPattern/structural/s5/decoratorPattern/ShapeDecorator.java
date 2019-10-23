package runoob.designPattern.structural.s5.decoratorPattern;

//创建实现了shape接口的抽象装饰类。
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
