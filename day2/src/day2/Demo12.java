package day2;

class GrandParent1 {

    void bp() {
        System.out.println("understand bp");
    }
}

class Parent6 extends GrandParent1 {

    void Cancer() {
        System.out.println("understand Cancer");
    }
}

public class Demo12 extends Parent6 {

    public static void main(String[] args) {

        Demo12 bb = new Demo12();

        bb.bp();
        bb.Cancer();
    }
}
