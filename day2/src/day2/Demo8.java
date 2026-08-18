package day2;

public class Demo8 {
	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Demo8 vv = new Demo8();
		vv.m1(4, 3);
		vv.m2();
	}
}
