package 结构型.外观模式;

public class Resturant {
    private Order order;
    private Pay pay;
    public Resturant() {
        order = new Order();
        pay = new Pay();
    }
   public void buy(Food food){
       System.out.println("购买-----"+food.getName());
       order.order();
       pay.pay();

   }

}
