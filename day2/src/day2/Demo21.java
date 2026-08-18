package day2;
class parent9
{
   int a =10;
		   int b =20;
}
	public class Demo21 extends parent9 {
		int a=20;
		int b =30;
		
		void add(int a , int b)
		{
			System.out.println(super.a+super.b);
			System.out.println(this.a+this.b);
			System.out.println(a+b);
		}
	public static void main(String[] args) {
		Demo21 jj = new Demo21();
		jj.add(2, 3);
		
	}
	}


