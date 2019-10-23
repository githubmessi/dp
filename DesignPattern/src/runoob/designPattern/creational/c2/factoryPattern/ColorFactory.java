package runoob.designPattern.creational.c2.factoryPattern;

//步骤6.创建拓展了abstractFactory的工厂类，基于给定的信息生成实体类的对象。
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String colorType) {
		if(colorType == null)
			return null;
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}else if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
