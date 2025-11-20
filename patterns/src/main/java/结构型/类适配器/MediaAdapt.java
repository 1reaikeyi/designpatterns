package 结构型.类适配器;

public class MediaAdapt implements Media{
    private Video video = null;
    public MediaAdapt() {
    }

    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp4")){
            video = new View();
            video.playView(fileName);
        }
        if(fileType.equalsIgnoreCase("view")){
            video = new Music();
            video.playMusic(fileName);
        }
    }
}
