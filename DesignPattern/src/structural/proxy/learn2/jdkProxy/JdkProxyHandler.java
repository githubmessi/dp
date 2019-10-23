package structural.proxy.learn2.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyHandler implements InvocationHandler{
	private Subject target;
	
	/*public JdkProxyHandler(Subject target){
		this.target = target;
	}*/
	
	public Object bind(Subject target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("进入代理逻辑");
		System.out.println("真实对象方法执行前的逻辑");
		Object object = method.invoke(target, args);
		System.out.println("真实对象方法执行后的逻辑");
		return object;
	}

}
