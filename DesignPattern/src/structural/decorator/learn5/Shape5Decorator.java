package structural.decorator.learn5;

public abstract class Shape5Decorator implements Shape5{

	protected Shape5 decoratedShape5;
	
	public Shape5Decorator(Shape5 decoratedShape5){
		this.decoratedShape5 = decoratedShape5;
	}
	
	public void draw(){
		this.decoratedShape5.draw();
	}
}
