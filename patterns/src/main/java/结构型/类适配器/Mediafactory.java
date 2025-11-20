package 结构型.类适配器;

public class Mediafactory implements Media{
    private MediaAdapt adapt;
    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("播放mp3文件：" + fileName);
        }else if (fileType.equalsIgnoreCase("view")
                ||
                fileType.equalsIgnoreCase("mp4")){
            adapt = new MediaAdapt();
            adapt.play(fileType, fileName);
        }
    }
}
