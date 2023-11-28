package ex07;
//사용자가 직접 만드는 예외처리
//ex) int age = -1; => 예외 발생 (내가 원하는 예외 메시지를 터미널에)

class MyException extends Exception{
  // 1. 기본 생성자
  public MyException() {
    super(); // 부모 생성자 함께 호출 (Exception)
  }

  // 2. 매개변수 생성자
  public MyException(String message){ //message = 내가 원하는 예외 메시지
    super(message);
  }
}

class A{
  void abc_1(int num) {
    if (num > 70)
      System.out.println("OK");
    else {
      try {
        throw new MyException("Num must be bigger than 70");
      } catch (MyException e) {
        System.out.println(e.getMessage());
      }
    }
  }
  void bcd_1(){
    abc_1(65);
  }
}

public class CreateUserException {
  public static void main(String[] args) {
    A a =new A();
    a.bcd_1();
  }
}
