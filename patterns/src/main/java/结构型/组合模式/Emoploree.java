package 结构型.组合模式;

import java.util.LinkedList;

public class Emoploree {
    private String name;
    private String job;
    private String department;
    private LinkedList<Emoploree> emoplorees;
    public Emoploree(String name, String job, String department) {
        this.name = name;
        this.job = job;
        this.department = department;
    }

    public LinkedList<Emoploree> getEmoplorees() {
        return emoplorees;
    }

    public void setEmoplorees(LinkedList<Emoploree> emoplorees) {
        this.emoplorees = emoplorees;
    }

    public Emoploree(){}
    public void add(Emoploree emoploree){
        if(emoplorees==null){
            emoplorees = new LinkedList<>();
        }
        emoplorees.add(emoploree);
    }
    public void remove(Emoploree emoploree){
        emoplorees.remove(emoploree);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
