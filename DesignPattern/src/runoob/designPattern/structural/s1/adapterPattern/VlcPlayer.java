package runoob.designPattern.structural.s1.adapterPattern;

//步骤2：创建实现了AdvancedMediaPlayer接口的实现类。
public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file. Name: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
