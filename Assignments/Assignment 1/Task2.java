import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String output = "";
    for(int i = 0; i<input.length();i++){
      int ascii = input.codePointAt(i);
      int prevAscii = ascii-1;
      char ch = (char)prevAscii;
      output+=ch;
    }
    System.out.println(output);
  }
}
      
      