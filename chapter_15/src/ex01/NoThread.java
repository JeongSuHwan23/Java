package ex01;
// 비디오 실행 프로그램을 만든다
// 비디오 실행은 프레임과 자막이 동시에 실행되어야 함
// -> 하나의 프로그램을 1. 프레임, 2. 자막 두 개의 쓰레드로 구현해야 함
// 쓰레드 사용 X 예시
//쓰레드를 안 쓰면 무조건 1개의 코어만 일한다
//쓰레드를 2개 이상 만들면 여러 개의 코어한테 일을 시킬 수 있게 되어서 프로그램 속도가 훨씬 빨라진다.

import java.util.TreeMap;

public class NoThread {
  public static void main(String[] args) {
    int[] frame = {1, 2, 3, 4, 5};
    String[] subtitle = {"one", "two", "three", "four", "five"};
    for (int i=0; i<5; i++){
      System.out.println("video frame " + frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    for (int i=0; i<5; i++){
      System.out.println("subtitle " + frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
