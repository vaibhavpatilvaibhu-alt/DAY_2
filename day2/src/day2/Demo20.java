package day2;
	class parent8
	{
	   int a =10;
			   int b =20;
	}

	public class Demo20 extends parent8 {
		int a=20;
		int b =30;
		
		void add(int a , int b)
		{
			System.out.println(super.a+super.b);
			System.out.println(this.a+this.b);
			System.out.println(a+b);
		}
	public static void main(String[] args) {
		Demo20 jj = new Demo20();
		jj.add(2, 3);
		
	}
	}

