public class ChickenBurger{
  String bun = "Sesame";
  int price = 200;
  String sauceOption = "less";
  String spiceLevel = "Not set";
  
  public String serveBurger(){
    if(spiceLevel.equals("Not set")){
      return "Cannot serve now. Customize Spice Level first";
    }else{
      return "The Burger is being served:\n" +
             "Bun Type: " + bun + "\n" +
             "Price: " + price + "\n" +
             "Sauce Option: " + sauceOption + "\n" +
             "Spice Level: " + spiceLevel;
//      return "Bun Type: " + bun;
//      return "Price: " + price;
//      return "Sauce Option: " + sauceOption;
//      return "Spice Level: " + spiceLevel;
    }
  }
  public void customizeSpiceLevel(String s){
    if(s.equals("Mild") || s.equals("Spicy") || s.equals("Naga") || s.equals("Extreme")){
      spiceLevel = s;
      System.out.println("SPice level set to " + spiceLevel);
    }else{
      System.out.println("This spice level is unavailable");
    }
  }
}
      