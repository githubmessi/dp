package structural.decorator.learn1;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep jeep = new Jeep();
		jeep.start();
		jeep.run();
		jeep.stop();
		System.out.println("=========");
		CarDecorator accJeep = new AccelerateCarDecorator(new Jeep());
		CarDecorator accQQ = new AccelerateCarDecorator(new QQ());
		accJeep.start();
		accJeep.run();
		accJeep.stop();
		System.out.println("=========");
		accQQ.start();
		accQQ.run();
		accQQ.stop();
		
	}

}
