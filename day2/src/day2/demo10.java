package day2;
class Parent2
{
	void cancer()
	{
		System.out.println(" understain");
	}
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
public class demo10 extends Parent2 {
	public static void main(String[] args) {
 		demo10  bb= new demo10();
 		bb.bp();
 		bb.cancer();
	}
}
