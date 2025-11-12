package 工厂模式;

public  class Chinesefactory extends Coursefactory{
   public Chinese get(){
       return new Chinese();
   }
}
