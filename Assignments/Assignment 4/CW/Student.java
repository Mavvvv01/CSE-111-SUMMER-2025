public class Student{
  public String name;
  public String prog;
  
  public Student(String n, String p){
    name = n;
    prog = p;
  }
  public void updateName(String s){
    this.name = s;
  }
  public void updateProgram(String s){
    prog = s;
  }
  public String accessProgram(){
    return prog;
  }
}