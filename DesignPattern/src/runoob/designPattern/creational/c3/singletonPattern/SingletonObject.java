package runoob.designPattern.creational.c3.singletonPattern;

//步骤1：创建一个singleton类。
public class SingletonObject {

	//创建singletonObject的一个对象
	private static SingletonObject instance = new SingletonObject();
	//让构造函数为private，这样该类就不会被实例化
	private SingletonObject(){
		
	}
	//获取唯一可用的对象
	public static SingletonObject getInstance(){
		return instance;
	}
	public void showMessage(){
		System.out.println("Hello World！");
	}
	
}
