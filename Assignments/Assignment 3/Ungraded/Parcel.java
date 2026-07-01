public class Parcel{
  public String name;
  public int weight;
  public double fee;
  
  public Parcel(String s, int n){
    name = s;
    weight = n;
  }
  public Parcel(){
  }
  public Parcel(String s){
    name = s;
  }
  
  public void printDetails(){
    if(name == null){
      System.out.println("Set name first");
    }else{
      System.out.println("Name: " + name);
      System.out.println("Total Weight: " + weight);
      System.out.println("Total Fee: " + fee);
    }
  }
    public void calcFee(String s){
      if(s.equals("Dhanmondi")){
        if(weight ==0){
          fee = 0;
        }else{
          fee = (weight*20)+50;
        }
      }else{
        fee = (weight*20);
      }
    }
    public void addWeight(int n){
      weight+=n;
    }
  }
        
  