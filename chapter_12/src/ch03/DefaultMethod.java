package ch03;
//interface = 구현 안된 다양한 기능의 집합

interface A {
  void abc();
  default void bcd(){
    System.out.println("bcd() in A interface");
  };
}

class B implements A {
  @Override
  public void abc() {
    System.out.println("abc() in B class");
  }
}

class C implements A{
  @Override
  public void abc() {
    System.out.println("abc() in C class");
  }
}

public class DefaultMethod {
  public static void main(String[] args) {
    A a1 = new B();
    A a2 = new C();

    a1.abc();
    a1.bcd(); //bcd = 부모가 준 디폴트 메서드
    a2.abc();
    a2.bcd();
  }
}
