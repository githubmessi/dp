package structural.proxy.learn2.jdkProxy;

public class RealSubject implements Subject{

	@Override
	public int sellBook() {
		// TODO Auto-generated method stub
		System.out.println("realSubject sellBooK()...");
		return 1;
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("realSubject speak()...");
		return "tom";
	}

}
