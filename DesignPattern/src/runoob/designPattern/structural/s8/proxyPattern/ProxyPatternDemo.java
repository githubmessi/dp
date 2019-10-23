package runoob.designPattern.structural.s8.proxyPattern;

//步骤3：使用代理对象来获取真实对象。
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("小明.jpg");
		image.display();
		System.out.println("==");
		image.display();
	}
}
