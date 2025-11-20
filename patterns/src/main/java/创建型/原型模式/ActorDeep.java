package 创建型.原型模式;

public class ActorDeep implements Cloneable{
    private String name;
    private String hobby;
    public String[] homeWork;
    public static int i = 0;
    public ActorDeep(){

        i++;
        System.out.println("第" + i + "次对象创建");

    }
    public String teacher;

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

    @Override
    public ActorDeep clone() throws CloneNotSupportedException {
        ActorDeep xy = (ActorDeep) super.clone();
        xy.homeWork = new String[homeWork.length];
        xy.teacher = new String(teacher);
        return xy;
    }
}
