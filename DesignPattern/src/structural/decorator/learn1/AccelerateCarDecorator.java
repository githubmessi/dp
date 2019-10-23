package structural.decorator.learn1;

public class AccelerateCarDecorator extends CarDecorator{

	public AccelerateCarDecorator(Car decoratedCar) {
		super(decoratedCar);
		// TODO Auto-generated constructor stub
	}
	
	public void start(){
		accelerate();
		decoratedCar.start();
	}
	
	public void run(){
		accelerate();
		decoratedCar.run();
	}

	public void stop(){
		accelerate();
		decoratedCar.stop();
	}
	
	private void accelerate(){
		System.out.println("对该汽车进行加速");
	}
}
