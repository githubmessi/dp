package runoob.designPattern.structural.s8.proxyPattern.ext.jdk;

//真实对象
public class RealSubject implements Subject {

	@Override
	public int sellBooks() {
		System.out.println("卖书");
		return 1;
	}

	@Override
	public String speak() {
		System.out.println("说话");
		return "张三";
	}

}
