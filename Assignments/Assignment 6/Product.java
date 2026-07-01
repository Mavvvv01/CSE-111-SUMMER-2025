public class Product{
  private String name = "Unknown";
  private double price;
  private int quantity;
  
  public Product(String s, double d){
    this.name = s;
    this.price = d;
  }
  public Product(){
  }  
  public void setName(String n){
    this.name = n;
  }
  public String getName(){
    return this.name;
  }
  public void setPrice(double n){
    this.price = n;
  }
  public double getPrice(){
    return this.price;
  }
  public void setQuantity(int n){
    this.quantity = n;
  }
  public int getQuantity(){
    return this.quantity;
  }
  public void displayInfo(){
    System.out.println("Product Name: " + this.getName());
    System.out.println("Price: $" + this.getPrice());
  }
  public void displayInfo(boolean b){
    if(b == false){
      displayInfo();
    }else{
      displayInfo();
      System.out.println("Quantity: " + this.getQuantity());
    }
  }
}
    
    