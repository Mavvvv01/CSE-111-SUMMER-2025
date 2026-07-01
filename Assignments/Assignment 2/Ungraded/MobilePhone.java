public class MobilePhone{
  int contactCapacity;
  String []name;
  int []num;
  int count;
  
  public void setContactCapacity(int n){
    contactCapacity = n;
    name = new String [n];
    num = new int[n];
  }
  public void details(){
    System.out.println("Contact List: ");
    for(int i = 0; i<count;i++){
      if(name[i] == "null"){
        break;
      }else{
        System.out.print(name[i]);
        System.out.print(num[i]);
        System.out.println();
      }
    }
  }
  public void addContact(String s, int n){
    if (count<contactCapacity){
      name[count]=s;
      num[count]=n;
      System.out.println("The contact of " + name[count] + " is added");
      count++;
    }else{
      System.out.println("Storage Full!");
    }
  }
  public void makeCall(int n){
    int hm = 0;
    for(int i = 0; i<count; i++){
      if(num[i] == n){
        hm = i;
        break;
      }
    }
    
    System.out.println("Calling " + name[hm]);
  }
}
      
  
  