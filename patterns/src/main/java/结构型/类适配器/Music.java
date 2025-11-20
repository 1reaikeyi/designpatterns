package 结构型.类适配器;

public class Music implements Video {


    @Override
    public void playView(String fileName) {
        System.out.println();
    }

    @Override
    public void playMusic(String fileName) {
        System.out.println("播放音乐文件：" + fileName);
    }
}
