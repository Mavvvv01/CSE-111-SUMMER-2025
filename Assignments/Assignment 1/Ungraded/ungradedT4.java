import java.util.Scanner;
public class ungradedT4{

  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
int [ ] [ ] A = {{1, 2, 4},
                        {5, 7, 2}};

    int k = sc.nextInt();
    for(int i = 0;i<A.length; i++){
      for(int j = 0;j<A[0].length;j++){
        int product = k*(A[i][j]);
        A[i][j] = product;
      }
    }
    for(int i = 0; i<A.length; i++){
      for(int j = 0;j<A[0].length;j++){
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}
