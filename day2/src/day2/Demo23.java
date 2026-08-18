package day2;
interface Atm2 {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class Demo23 implements Atm2, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		Demo23 v = new Demo23();
		v.min();
		v.depo();
	}
}
