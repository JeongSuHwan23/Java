package ex04;

//finally{} = 맨 마지막에 반드시 마무리로 실행되어야 하는 문장이 들어감
//대표적으로 '리소소 반남'
//ex) 스트링 반납, 메모리 공간 반납


import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
  public static void main(String[] args){
    InputStreamReader isr1 = null;
    isr1 = new InputStreamReader(System.in);
    char input = 0;
    try {
      input = (char) isr1.read();
      System.out.println(input);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    //리소스 해제 구문 (옛날)
    finally {
      if(isr1!=null){
        try {
          isr1.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
    //위에서 스트림을 finally를 close 함
    //
    //리소스 자동 해제
    //try ()안에 자동으로 해제하고 싶은 리소스를 적어 넣는다
    try(InputStreamReader isr2 = new InputStreamReader(System.in);) {
      char input2 = (char) isr2.read();
      System.out.println("입력 글자 : "+input2);
    }
    catch (IOException e){
      e.printStackTrace();
    }
  }
}