public class KKTea extends Tea{
  public int weight;
  public int bags;
  public static int regular;
  public static int flavored;
  public static int total;
  
  public KKTea(int p, int b){
    super("KK Regular Tea", p);
    bags = b;
    weight = b*2;
  }
  public void productDetail(){
    super.productDetail();
    System.out.println("Weight: " + weight + ", " + "Tea Bags: " + bags);
  }
  public static void updateSoldStatusRegular(KKTea k){
    k.status = true;
    total++;
    regular++;
  }
  public static void totalSales(){
    System.out.println("Total Sales: " + total);
    System.out.println("KK Regular Tea: " + regular);
    if(flavored !=0){
    System.out.println("KK Flavoured Tea: " + flavored);
    }
  }
}
  
    
  
  