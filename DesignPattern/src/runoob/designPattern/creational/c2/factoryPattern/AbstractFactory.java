package runoob.designPattern.creational.c2.factoryPattern;

//步骤5：为color和shape对象创建抽象类来获取工厂。
public abstract class AbstractFactory {

	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
