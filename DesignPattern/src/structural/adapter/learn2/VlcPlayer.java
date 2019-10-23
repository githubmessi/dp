package structural.adapter.learn2;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file. FileName: " + fileName);
	}

	@Override
	public void playMp4(String FileName) {
		// TODO Auto-generated method stub
		
	}

}
