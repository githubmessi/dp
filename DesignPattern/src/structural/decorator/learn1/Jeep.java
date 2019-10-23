package structural.decorator.learn1;

public class Jeep implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Jeep车启动");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Jeep车行驶");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Jeep车停止");

	}

}
