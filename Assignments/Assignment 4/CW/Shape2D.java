public class Shape2D{
  public int s1;
  public int s2;
  public int s3;
  public int name;
  public double area;

  public void Shape2D(){
    name = "Square";
    s1 = 5;
    System.out.println("A Square has been created with length: " + s1);
  }
  public void Shape2D(int n1, int n2){
    name = "Rectangle";
    s1 = n1;
    s2 = n2;
    System.out.println("A Rectangle has been created with length: " + s1 + "and breadth: " + s2);
  }
  public void Shape2D(int n1, int n2, String s){
    name = s;
    s1 = n1;
    s2 = n2;
    
    