package ex02;

//예외가 발생할 가능성이 있는 문장들을 {}로 묶어서 예외처리를 함
//1. try-catch 묶기 (내가 직접 책임)
//2. throws 던지기 (나를 호출한 쪽에 책임을 전가)
//try{} 에외 발생 가능성이 있는 문장들을 적는 곳
//catch{}에는 try{}에서 에러가 발생하면 처리하는 차선책이 적힘
//try{}에서 예외 발샐 X -> catch{} 실행 X

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryCatchFinally {
  public static void main(String[] args) {
    System.out.println("before delay");
    try {
      Thread.sleep(1000); //쓰레드를 호출시켜서 1초 멈추기
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("after delay");

    //forname 안에 있는 클래스를 JVM이 메모리로 올려서 객체 하나를 반환하는 명령
    try {
      Class cls = Class.forName("java.lang.Object");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    InputStreamReader in = new InputStreamReader(System.in);
    try {
      in.read();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
