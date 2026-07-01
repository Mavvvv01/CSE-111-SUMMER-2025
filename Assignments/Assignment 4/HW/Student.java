public class Student{
  public int ID;
  public double CGPA;
  public String [] courses = new String [4];
  public boolean CG = false;
  public int count;
  
  public Student(int i){
    ID = i;
    System.out.println("A student with ID " + ID + " has been created");
  }
  public Student(int i, double j){
    ID = i;
    CGPA = j;
    CG=true;
    System.out.println("A student with ID " + ID + " and CGPA " + CGPA + " has been created");
  }
  public void addCourse(String s){
    if(CG == false){
      System.out.println("Failed to add " +s);
      System.out.println("Set CG First");
    }else{
    if(count<4){
      if(CGPA<3.0){
        if(count<3){
          courses[count]=s;
          count++;
        }else{
          System.out.println("CG is low. Can't add more than 3 courses");
        }
      }else{
        courses[count]=s;
        count++;
      }
    }else{
      System.out.println("Failed to add " + s);
      System.out.println("Maximum 4 courses allowed");
  }
    }
  }
  public void addCourse(String []s){
    for(int i =0; i<s.length;i++){
    addCourse(s[i]);
    }
  }
  public void showAdvisee(){
    System.out.println("Student ID: " + ID + ", " + "CGPA: "+ CGPA);
    if(count>0){
      System.out.println("Added Courses are: ");
      for(int i =0; i<count; i++){
        System.out.print(courses[i] + " ");
      }
      System.out.println();
    }else{
      System.out.println("No courses added");
    }
  }
  public void storeCG(double i){
    CGPA = i;
    CG = true;
  }
  public void storeID(int i){
    ID = i;
  }
  public void removeAllCourse(){
    count=0;
  }
}