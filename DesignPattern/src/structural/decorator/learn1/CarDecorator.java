package structural.decorator.learn1;

public abstract class CarDecorator implements Car {
	
	protected Car decoratedCar;

	public CarDecorator(Car decoratedCar) {
		super();
		this.decoratedCar = decoratedCar;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		decoratedCar.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		decoratedCar.run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		decoratedCar.stop();
	}

}
