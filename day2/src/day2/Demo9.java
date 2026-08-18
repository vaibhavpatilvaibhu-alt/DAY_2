package day2;

 class Parent {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class Demo9 extends Parent {

	public static void main(String[] args) {
		Demo9 test = new Demo9();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}
