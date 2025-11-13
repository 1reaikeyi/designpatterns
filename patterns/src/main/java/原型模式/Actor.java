package 原型模式;

public class Actor {
    private String name;
    private String hobby;
    public static int i = 0;
    public Actor(){
        i++;
        System.out.println("第" + i + "次对象创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
