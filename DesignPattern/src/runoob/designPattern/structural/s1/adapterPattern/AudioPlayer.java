package runoob.designPattern.structural.s1.adapterPattern;

//步骤5：创建实现了MediaPlayer接口的实体类。
public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+fileName);
		} else if(audioType.equalsIgnoreCase("vlc") || 
				audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid mediaType ." + audioType + " format not supported.");
		}
		
	}
}
