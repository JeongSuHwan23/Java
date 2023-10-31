package ch01;
// final field = 최초 선언 시 값을 반드시 저장, 변경 X
// final method = 자식이 override 불가
//final class = 다른 클래스가 상속 X

class A {
     int a=3;
     final int b=5;
     void abc() {}
     final void bcd() {}
}

class B extends A {
    //final method는  자식이 override 불가
    //void bcd() {} (X)
}

final class C{}

//final class는 더 이상 상속 불가
//class D extends C{}

public class FinalModifier {
    public static void main(String[] args) {
        A a;
        a = new A();
        a.a = 10;
        // final field 사용 불가
        // a.b = 5; (X)
        
    }
}
