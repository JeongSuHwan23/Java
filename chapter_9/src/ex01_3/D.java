package ex01_3;

import ex01_1.A;

//D extend A를 했다는 것은 A는 부모 클래스, D가 A의 자식 클래스
//D가 A의 자식이 되는 순간 A의 필드, 메서드 D가 모두 복사가 된다
public class D extends A{
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        System.out.print(this.b + " ");
//        System.out.print(a.c + " ");
//        System.out.print(a.d + " ");
        System.out.println();
    }
}
