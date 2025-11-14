package 合成复用原则;

public class School {
    private aDaily highStu;  // 使用接口类型
    private aDaily junior;   // 使用接口类型

    public aDaily getJunior() {
        return junior;
    }

    public void setJunior(Junior junior) {
        this.junior = junior;
    }

    public aDaily getHighStu() {
        return highStu;
    }

    public void setHighStu(HighStu highStu) {
        this.highStu = highStu;
    }

    @Override
    public String toString() {
        return "cSchool{" +
                "highStu=" + highStu +
                ", junior=" + junior +
                '}';
    }
}
