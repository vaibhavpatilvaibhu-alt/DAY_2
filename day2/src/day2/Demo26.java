package day2;
import java.util.Scanner;
public class Demo26 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = sc.nextInt();
        float e = sc.nextInt();
        float mul = a * b * c * d * e;
        System.out.println("multiplication = " + mul);
        sc.close();
	}

	

}
