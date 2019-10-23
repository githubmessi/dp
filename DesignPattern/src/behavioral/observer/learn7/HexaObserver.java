package behavioral.observer.learn7;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Hexa String: " 
				+ Integer.toHexString(subject.getState()));
	}

}
