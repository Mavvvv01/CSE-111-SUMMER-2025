public class Bird{
  String name;
  int height;
  
  public void makeNoise(){
    System.out.println("Squawk");
  }
  public void flyUp(int n){
      height = height+n;
      System.out.println(name + " has flown up " + n + " feet");
  }
  public void flyDown(int n){
    if((height-n)>0){
      height = height-n;
      System.out.println(name + " has flown down " + n + " feet");
    }else if((height-n)==0){
      height = 0;
      System.out.println(name + " has flown down " + n + " feet and landed");
    }else if((height-n)<0){
      System.out.println(name + " cannot fly down " + n + " feet");
    }
  }
}