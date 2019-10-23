package runoob.designPattern.structural.c5.decoratorPattern;

//步骤3：创建实现了Shape接口的抽象装饰类
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
