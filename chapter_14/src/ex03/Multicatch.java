package ex03;

public class Multicatch {
  public static void main(String[] args) throws ArithmeticException{
//    try {
//      System.out.println(3 / 0);
//      System.out.println("프로그램 종료");
//    }
//    catch (ArithmeticException e){
//      System.out.println("0으로 나눌 수 없음");
//    }
//    finally{
//      System.out.println("프로그램 종료");
//    }
//
//    //Integer = parseInt() : ()안에 있는 문자를 숫자로 변환
//    try{
//      int num = Integer.parseInt("10A");
//      System.out.println(num);
//    }
//    catch (NumberFormatException e) {
//      System.out.println("change X");
//    }
    try{
      System.out.println(3/0);
      int num = Integer.parseInt("10Z");
      System.out.println(num);
    }
    catch (ArithmeticException | NumberFormatException e){
      System.out.println("예외 발생");


    }
  }
}
