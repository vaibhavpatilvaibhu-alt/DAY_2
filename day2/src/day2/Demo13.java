package day2;

class GrandParent3 {

    void bp() {
        System.out.println("understand bp");
    }
}

class Parent7 extends GrandParent3 {

    void cancer() {
        System.out.println("understand cancer");
    }
}

public class Demo13 extends Parent7{

    public static void main(String[] args) {

        Demo13 bb = new Demo13();

        bb.bp();
        bb.cancer();
    }
}