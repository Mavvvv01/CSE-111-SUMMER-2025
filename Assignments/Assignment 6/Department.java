public class Department{
  public String name;
  public int students;
  public Student[] list = new Student [5];
  public int count;
  
  public Department(String s){
    this.name = s;
  }
  public void details(){
    System.out.println("Department Name: " + this.name);
    System.out.println("Number of students: " + students);
    System.out.println("Details of the students: ");
    for(int i = 0;i <count; i++){
      System.out.print("Student Name: " + list[i].name);
      System.out.print(", " + "ID: " + list[i].getID());
      System.out.println(", " + "cgpa: " + list[i].cg);
    }
  }
  public void addStudent(Student s){
    if(count<5){
      boolean found = false;
      for(int i = 0; i<this.count; i++){
        if(list[i].getID() == s.getID()){
          found = true;
        }
      }
      if(found ==true){
      System.out.println("Student with the same ID Already exists, Please try with another ID");
      }else{
        System.out.println("Welcome to " + this.name + " Department, " + s.name);
        list[count] = s;
        count++;
        students++;
      }
    }else{
      System.out.println("Can't add more students");
    }
  }
  public void findStudent(int n){
    int store = 0;
    boolean found = false;
    for(int i = 0;i<count;i++){
      if(list[i].getID() == n){
        store = i;
        found = true;
      }
    }
      if(found){
        System.out.println("Student info: ");
        System.out.println("Student Name: " + list[store].name);
        System.out.println("ID: " + list[store].getID());
        System.out.println("CGPA: " + list[store].cg);
      }else{
        System.out.println("Student with this ID doesn't exist, Please give a valid ID");
      }
    }
  public void addStudent(Student l, Student m, Student n){
    addStudent(l);
    addStudent(m);
    addStudent(n);
  }
}

  
  