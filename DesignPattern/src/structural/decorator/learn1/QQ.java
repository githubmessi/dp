package structural.decorator.learn1;

public class QQ implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("QQ车启动。");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("QQ车行驶。");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("QQ车停止。");

	}

}
