package 工厂模式;

public  class Chinesefactory extends Coursefactory{
   public Course get(){
       return new Chinese();
   }
}
