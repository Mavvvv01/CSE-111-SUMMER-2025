public class Toy{
  public int price;
  public String name;
  
  public Toy(String s, int n){
    name = s;
    price = n;
    System.out.println("A new toy has been made!");
  }
   public void updatePrice(int n){
    price = n;
   }
   public void showPrice(){
     System.out.println("price: " + price + " Taka");
   }
   public void updateName(String s){
     System.out.println("Changing old name: " + name);
     name = s;
     System.out.println("new name: " + name);
   }
}
    