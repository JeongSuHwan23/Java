package ch02;

interface A {
  int a = 3;

  void abc();
}

//B 지정 안 하고 new()
//class B implements A{
//  @Override
//  public void abc(){
//    System.out.println("B가 책임지고 오버라이팅 했다");
//  }
//
//}


public class CreateObjectOfInterface {
  public static void main(String[] args) {
    //A a1 = new A(); 인터페이스는 바로 new() 객체에서 사용  XX

    A a1 = new A() { //익명 이너 클래스
      @Override
      public void abc(){ //익명 이너 클래스
        System.out.println("override in main");
      };
    };

    System.out.println(a1.a);
    a1.abc();
  }
}
