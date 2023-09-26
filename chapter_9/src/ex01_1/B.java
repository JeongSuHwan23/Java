package ex01_1;

public class B {
    public void print(){
        // A class 객체 생성
        A a = new A();

        //맴버 활용
        System.out.print(a.a+" ");
        System.out.print(a.b+" ");
        System.out.print(a.c+" ");
        //private = 같은 클래스 파일 안에서만 사용 가능 (같은 패키지여도 다른 파일이면 사용 X)
        //System.out.print(a.d+" ");
        System.out.println();
    }
}
