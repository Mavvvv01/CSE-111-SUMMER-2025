public class Employee{
  private String name;
  private int ID;
  private String type;
  
  public Employee(String n, int i, String t){
    this.name = n;
    this.ID = i;
    this.type = t;
  }
  public Employee(){
    System.out.println("A default employee has been created");
  }
  public void setName(String s){
    this.name = s;
  }
  public String getName(){
    return this.name;
  }
  public void setID(int n){
    this.ID = n;
  }
  public int getID(){
    return this.ID;
  }
  public void setType(String s){
    this.type = s;
  }
  public String getType(){
    return this.type;
  }
}