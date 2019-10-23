package structural.proxy.learn2.jdkProxy;

public class JdkDynamicProxyDemo {

	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		//JdkProxyHandler jdkProxyHandler = new JdkProxyHandler(subject);
		JdkProxyHandler jdkProxyHandler = new JdkProxyHandler();
		Subject proxy = (Subject) jdkProxyHandler.bind(subject);
		System.out.println(proxy);
		
		System.out.println("===");
		proxy.sellBook();
		System.out.println("===");
		proxy.speak();
	}
}
