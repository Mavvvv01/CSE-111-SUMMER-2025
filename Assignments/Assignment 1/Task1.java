import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int counter = 0;
    for(int i = n1; i<=n2; i++){
      boolean isPrime = true;
      for(int j = 2; j<i; j++){
        if(i%j==0){
          isPrime = false;
          break;
        }
      }
       if(isPrime){
          counter++;
      }
    }
    System.out.println("There are "+ counter + " prime numbers between " + n1 + " and " + n2);
  }
}