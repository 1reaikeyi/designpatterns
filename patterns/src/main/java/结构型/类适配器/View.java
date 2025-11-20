package 结构型.类适配器;

public class View implements Video {
    @Override
    public void playView(String fileName) {
        System.out.println("播放视频"+fileName);
    }

    @Override
    public void playMusic(String fileName) {
        System.out.println();
    }
}
