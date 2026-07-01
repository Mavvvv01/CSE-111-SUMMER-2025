public class Triangle{
  public int s1;
  public int s2;
  public int s3;
  public int perimeter;
  
  public Triangle(int n1, int n2, int n3){
    s1=n1;
    s2=n2;
    s3=n3;
    perimeter = s1+s2+s3;
  }
  public void triangleDetails(){
    System.out.println("Three sides of the triangle are: " + s1 + ", " + s2 + ", " + s3);
    System.out.println("Perimeter: " + perimeter);
  }
  public String printTriangleType(){
    if(s1==s2 && s2==s3){
      return("This is an Equilateral Triangle");
    }else if(s1==s2 || s2==s3 || s3==s1){
      return("This is an Isosceles Triangle");
    }else{
      return("This is a Scalene Triangle");
    }
  }
  public void compareTriangles(Triangle t){
    if(this == t){
      System.out.println("These two triangle objects have the same address.");
    }else if(this.s1==t.s1 && this.s2==t.s2 && this.s3==t.s3){
      System.out.println("Addresses are different but the sides of the triangles are equal.");
    }else if(this.perimeter == t.perimeter){
      System.out.println("Only the perimeter of both triangles is equal.");
    }else{
      System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
  }
}
      
  
  