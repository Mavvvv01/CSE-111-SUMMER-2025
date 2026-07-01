public class Teacher{
  public String name;
  public String init;
  public String [] courses = new String[3];
  public int counter;

  public Teacher(String s, String s2){
    name = s;
    init = s2;
    System.out.println("A new teacher has been created");
  }
  public void addCourse(Course c){
    if(counter<3){
    courses[counter] = c.name;
    counter++;
    }else{
      System.out.println("Can't add more courses");
    }
  }
  public void printDetail(){
    System.out.println("Name: " + name);
    System.out.println("Initial: " + init);
    System.out.println("List of courses: ");
    for(int i = 0; i<counter; i++){
      System.out.println(courses[i]);
    }
  }
}