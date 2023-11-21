package ex05;

import java.io.InputStreamReader;

class A{
  void adc(){
    bcd();
  }
  void bcd() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

class B{
  void abc(){
    try {
      bcd();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  void bcd() throws InterruptedException {
    Thread.sleep(1000);
  }
}


public class ThrowsException {
  public static void main(String[] args) {

  }
}
