package ex05;

class A {
    void abc(){
        System.out.println("A class의 abc()");
    }
}

class B extends A {
    void bcd() {
        //super -> 부모
        //super는 덮어쓰기를 하기 전 부모의 원형을 찾을 수 있다
        super.abc();
    }

    @Override
    void abc() {
        System.out.println("B class의 abc()");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B bb = new B();

        bb.bcd();

    }
}
