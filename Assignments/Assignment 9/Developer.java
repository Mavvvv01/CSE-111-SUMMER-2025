public class Developer extends Employee{
  public String lang;
  public double finalSalary;
  
  public Developer(String s, int base, int wh, String ln){
    super(s, base, wh);
    lang = ln;
  }
  public void calculateSalary(){
    if(lang.equals("Java")){
      finalSalary = this.getBaseSalary() + 700.0;
    }else{
      finalSalary = this.getBaseSalary();
    }
  }
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: " + lang);
    System.out.println("Final Salar: " + "$" +finalSalary);
  }
}