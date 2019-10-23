package runoob.designPattern.creational.c1.factoryPattern;

//3.创建一个工厂，生成基于给定信息的实体类的对象。
public class ShapeFactory {

	//使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType){
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}
}
