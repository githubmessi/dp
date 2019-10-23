package runoob.designPattern.structural.s8.proxyPattern;

//步骤2：创建实现接口的真实类。
public class RealImage implements Image{
	
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display"+fileName);
	}
	private void loadFromDisk(String fileName){
		System.out.println("Loading"+fileName);
	}

}
