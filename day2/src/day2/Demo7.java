package day2;

public class Demo7 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		Demo7   vv = new Demo7();
		vv.m1(4,3);
		vv.m2();
	}
}
