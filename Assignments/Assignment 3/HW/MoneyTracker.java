public class MoneyTracker{
  public String name;
  public double currentBalance;
  public double lastAdd;
  public double lastSpent;
  
  public String info(){
    return("Name: " + name + "\n" + "Current Balance: " + currentBalance);
  }
  public void createTracker(String s){
    this.name = s;
    currentBalance+=1.0;
  }
  public void income(int n){
    currentBalance+=n;
    lastAdd = n;
    System.out.println("Balance updated!");
  }
  public void expense(int n){
    if(currentBalance - n == 0){
      currentBalance =0;
      System.out.println("You're Broke");
      lastSpent = n;
    }else if(currentBalance - n <0){
      System.out.println("Not enough Balance");
    }else{
    currentBalance-=n;
    lastSpent = n;
    System.out.println("Balanced updated!");
  }
  }
  public void showHistory(){
    System.out.println("Last added: " + lastAdd);
    System.out.println("Last spent: " + lastSpent);
  }
}
    
    