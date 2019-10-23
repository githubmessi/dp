package runoob.designPattern.creational.c3.singletonPattern;

//步骤2：从singleton类获取唯一的对象
public class SingletonPatternDemo {

	public static void main(String[] args) {
		//获取唯一可用的对象
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();
	}
}
