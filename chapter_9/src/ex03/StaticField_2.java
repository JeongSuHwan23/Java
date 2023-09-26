package ex03;

class A{
    //instance field
    int m = 3;

    //static field
    static int n = 5;
}

public class StaticField_2 {
    public static void main(String[] args) {
        //객체 2개 생성 (a1과 a2는 서로 다름)
        A a1 = new A();
        A a2 = new A();

        //instance field
        a1.m = 5;
        a2.m = 6;

        System.out.println("a1.m = " + a1.m);
        System.out.println("a2.m = " + a2.m);
        System.out.println();

        //static field
        a1.n = 7;
        a2.n = 8;

        System.out.println("a1.n = " + a1.n);
        System.out.println("a2.n = " + a2.n);
        System.out.println();

        A.n = 9;
        System.out.println(a1.n);
        System.out.println(a2.n);
    }
}
