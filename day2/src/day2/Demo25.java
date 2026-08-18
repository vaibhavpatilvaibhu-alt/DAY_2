package day2;
import java.util.Scanner;
	public class Demo25{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 5 numbers:");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        int e = sc.nextInt();
	        int sum = a + b + c + d + e;
	        System.out.println("Sum = " + sum);
	        sc.close();
	    }
	}