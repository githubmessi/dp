package structural.proxy.learn1;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProxyImage proxyImage = new ProxyImage("小明.jpg");
		proxyImage.display();
		System.out.println("==");
		proxyImage.display();
	}

}
