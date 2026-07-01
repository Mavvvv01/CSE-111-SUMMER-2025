import java.util.*;
public class ungradedT5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int [][] arr = new int[M][N];
    for(int i=0;i<M; i++){
      for(int j=0;j<N;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int [][] tarr = new int [N][M];
    for(int i=0;i<M; i++){
      for(int j=0;j<N;j++){
        tarr[j][i] = arr[i][j];
      }
    }
    for(int i=0;i<M; i++){
      for(int j=0;j<N;j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i=0;i<N; i++){
      for(int j=0;j<M;j++){
        System.out.print(tarr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
    
        