public class Company{
  public String name = "ABC Company";
  public int worker;
  public Employee[] list = new Employee [3];
  public int count;
  
  public void details(){
    System.out.println("Company Name: " + this.name);
    System.out.println("Total Employee: " + this.worker);
    System.out.println("Fulltime Employees: ");
    for(int i = 0; i<count; i++){
      if(list[i].getType() == "Fulltime"){
      System.out.print("Name: " + list[i].getName());
      System.out.println(", " + "ID: " + list[i].getID());
      }
    }
    System.out.println("Part-time Employees: ");
    for(int i = 0; i<count; i++){
      if(list[i].getType() == "Part-time"){
      System.out.print("Name: " + list[i].getName());
      System.out.println(", " + "ID: " + list[i].getID());
      }
    }
  }
  public void addEmployee(Employee e){
    if(count<3){
    list[count++] = e;
    worker++;
    System.out.println(e.getName() + " has joined the company");
    }else{
      System.out.println("No more vacancy");
    }
  }
  public void removeEmployee(Employee e){
    System.out.println(e.getName() + " has left the company");
    int store = 0;
    for(int i = 0; i<count; i++){
      if(list[i] == e){
        store = i;
      }
    }
    for(int j = store; j<count; j++){
      list[j] = list[j++];
    }
    worker--;
    count--; 
  }       
}
    
    
  