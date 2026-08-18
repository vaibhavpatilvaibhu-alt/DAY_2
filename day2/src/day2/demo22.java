package day2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class demo22 extends Abc {
	public	void with()
	{
		System.out.println("With");
	}

	
public static void main(String[] args) {
	demo22   v = new demo22();
	v.depo();
	v.with();
}
}
