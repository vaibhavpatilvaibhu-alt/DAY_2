package day2;
class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent3 extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class Demo11 extends Parent3{
	public static void main(String[] args) {
 		Demo11  bb= new Demo11();
 		bb.bp();
 		bb.cancer();
	}
}
