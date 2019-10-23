package runoob.designPattern.structural.s8.proxyPattern;

//步骤2：创建实现接口的代理类。
public class ProxyImage implements Image{
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realImage == null)
			realImage = new RealImage(fileName);
		realImage.display();
	}
}
