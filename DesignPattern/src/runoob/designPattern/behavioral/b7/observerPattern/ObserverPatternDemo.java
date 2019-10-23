package runoob.designPattern.behavioral.b7.observerPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		subject.notifyAllObservers();
		System.out.println("First state change: 10");
		subject.setState(10);
		subject.notifyAllObservers();
	}

}
