public class Student{
  public String name;
  public double cg;
  private int ID;
  
  public Student(String s, int n, double d){
    this.name = s;
    this.cg = d;
    this.ID = n;
  }
  public void setId(int n){
    this.ID = n;
  }
  public int getID(){
    return this.ID;
  }
}