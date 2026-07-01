public class Spaceship{
  public String name;
  public int capacity;
  public int currentC;
  public int currentW;
  public Cargo[ ]list  = new Cargo [100];
  public int count;
  
  public Spaceship(String s, int n){
    name = s;
    capacity = n;
    currentC = n;
  }
  public void loadCargo(Cargo c){
    if((currentC-c.getWeight())>0){
      list[count] = c;
      count++;
      currentC = currentC-c.getWeight();
      currentW+=c.getWeight();
    }else{
      System.out.println("Warning: Unable to load " + c.getName() + " inside " + this.name + ". Exceeds capacity by " + ((currentC - c.getWeight())*(-1)));
    }
  }
  public void displayDetails(){
    System.out.println("Spaceship Name: " + this.name);
    System.out.println("Capacity: " + capacity);
    System.out.println("Current Cargo Weight: " + this.currentW);
    System.out.print("Cargo: ");
    for(int i = 0;i<count; i++){
      System.out.println(list[i].getName());
    }
  }
}
    
      
    
  