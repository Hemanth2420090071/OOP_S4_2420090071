package mypack;
import java.util.*;
public class TernaryOperators {
	public static void main(String[] args) {
	
         System.out.println("Enter two numbers");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         
         int greater = (a>b) ? a : b;
         System.out.println("The greatest number is: "+greater);
         
         
	}
}
