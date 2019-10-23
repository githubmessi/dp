package runoob.designPattern.structural.s8.proxyPattern.ext.jdk;

import java.lang.reflect.Proxy;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject realSubject = new RealSubject();
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
		Subject proxySubject = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Subject.class}, myInvocationHandler);
		proxySubject.sellBooks();
		proxySubject.speak();
	}

}
