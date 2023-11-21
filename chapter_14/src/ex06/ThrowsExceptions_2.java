package ex06;

class A{
  void abc(){
    bcd();
  }
  void bcd(){
    //한 메서드 안에서 두 개 이상의 예외 처리가 있으면 throws
    try {
      Class cls = Class.forName("java.lang.object");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

public class ThrowsExceptions_2 {
}
