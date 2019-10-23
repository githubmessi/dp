package runoob.designPattern.structural.s1.adapterPattern;

//步骤1：为媒体播放器和更高级的媒体播放器创建接口。
public interface MediaPlayer {
	
	void play(String audioType, String fileName);
}
