public class Cargo{
  private String name;
  private int weight;
  
  public Cargo(String s, int n){
    this.name = s;
    this.weight = n;
  }
  public void setName(String s){
    this.name = s;
  }
  public String getName(){
    return this.name;
  }
  public void setWeight(int n){
    this.weight = n;
  }
  public int getWeight(){
    return this.weight;
  }
}
  