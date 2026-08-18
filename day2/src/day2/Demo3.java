package day2;
class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class Demo3 extends Parents {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		Demo3 test = new Demo3();// object
		test.marry();
		test.property();
	
	}
}

