package 迪米特法则;

public class Compary {
    private aStar star;
    private aFans fan;

    public aStar getStar() {
        return star;
    }

    public void setStar(aStar star) {
        this.star = star;
    }

    public aFans getFan() {
        return fan;
    }

    public void setFan(aFans fan) {
        this.fan = fan;
    }
    public void come(){
        System.out.println("star:"+getStar().getName()+"-----------come------------fan:"+getFan().getName());
    }
}
