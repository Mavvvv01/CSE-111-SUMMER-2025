import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i = 0;i<N; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<N; i++){
      boolean printed = false;
      for(int j = 0; j<i; j++){
        if(arr[i]==arr[j]){
          printed = true;
          break;
        }
      }
      if(!printed){
        int count = 0;
        for(int j = 0; j<N; j++){
          if(arr[i]==arr[j]){
            count++;
          }
        }
        System.out.println(arr[i] + " - " + count + " times ");
      }
    }
  }
}
        
        