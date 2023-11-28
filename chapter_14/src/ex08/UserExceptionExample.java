package ex08;

import java.util.Scanner;

// Exception 1. score < 0
class MinusException extends Exception {
  public MinusException() {
    super();
  }

  public MinusException(String message) {
    super(message);
  }
}

// Exception 2. score > 100
class OverException extends Exception {
  public OverException() {
    super();
  }

  public OverException(String message) {
    super(message);
  }
}

class A {
  void checkScore(int score) throws MinusException, OverException {
    if (score < 0) {
      throw new MinusException("Expection : score is minus");
      //Exception 발동시키는 명령어 -> throw
    } else if (score > 100) {
      throw new OverException("Expection : score is over 100");
    }
  }
}

public class UserExceptionExample {
  public static void main(String[] args) {
    A a = new A();
    Scanner s = new Scanner(System.in);
    int score;
    while (true){
      System.out.println("Input your score : ");
      score = s.nextInt();
      try{
        a.checkScore(score);
      } catch (MinusException | OverException e) {
        System.out.println(e.getMessage());
        break;
      }
      System.out.println("Your score is " + score);
    }
  }
}
