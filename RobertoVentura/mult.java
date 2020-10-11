
import java.util.Scanner;
 
public class Exercise7 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
 

System.out.println("program that takes a number as input and prints its multiplication table upto 10");

  System.out.print("Input a number: ");
  int num1 = in.nextInt();
   
  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
  }
 }
}

