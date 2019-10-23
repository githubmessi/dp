package structural.proxy.learn1;

public class RealImage implements Image{
	
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + fileName);
	}
	private void loadFromDisk(){
		System.out.println("Loading " + fileName);
	}

}
