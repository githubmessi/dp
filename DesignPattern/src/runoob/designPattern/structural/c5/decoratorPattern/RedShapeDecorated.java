package runoob.designPattern.structural.c5.decoratorPattern;

//步骤4：创建扩展了ShapeDecorator类的实体类装饰类。
public class RedShapeDecorated extends ShapeDecorator {

	public RedShapeDecorated(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	private void setRedBorder(){
		System.out.println("Border color: Red..");
	}
	
	public void draw(){
		decoratedShape.draw();
		setRedBorder();
	}

}
