package structural.decorator.learn5;

public class BlueShape5Decorator extends Shape5Decorator{

	public BlueShape5Decorator(Shape5 decoratedShape5) {
		super(decoratedShape5);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(){
		decoratedShape5.draw();
		blueBorder();
	}

	private void blueBorder() {
		// TODO Auto-generated method stub
		System.out.println("增强的bolueBorder()方法。");
	}
	

}
