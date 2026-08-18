package day2;

interface GrandParent2 {
    void bp();
}

interface Parent10{
    void cancer();
}

public class Demo14 implements GrandParent2, Parent10 {

    public void bp() {
        System.out.println("understand bp");
    }

    public void cancer() {
        System.out.println("understand cancer");
    }

    public static void main(String[] args) {

        Demo14 bb = new Demo14();

        bb.bp();
        bb.cancer();
    }
}