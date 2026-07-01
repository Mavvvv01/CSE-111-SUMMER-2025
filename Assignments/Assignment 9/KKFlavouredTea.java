public class KKFlavouredTea extends KKTea{
  public boolean sold;
  
  public KKFlavouredTea(String s, int p, int b){
    super(p, b);
    weight = b*2;
    name ="KK " + s + " Tea"; 
  }
  public static void updateSoldStatusFlavoured(KKFlavouredTea s){
    s.sold = true;
    flavored++;
    total++;
  }
}

  