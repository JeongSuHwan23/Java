package ex02;
//Thread 1 (subtitle)
class SMIFileThread extends Thread{
  @Override
  public void run() {
    String[] subtitle = {"one", "two", "three", "four", "five"};

    for (int i=0; i<5; i++){
      System.out.println("(subtitle) " + subtitle[i]);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

//Tread 2 (frame)
class VideoFileThread extends Thread{
  @Override
  public void run() {
    int[] frame = {1, 2, 3, 4, 5};

    for (int i=0; i<5; i++){
      System.out.println(" -Frame " + frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}


public class FirstWayToMakeThread {
  public static void main(String[] args) {
    Thread videoFileThread = new VideoFileThread();
    videoFileThread.start();

    Thread smiFileThread = new SMIFileThread();
    smiFileThread.start();
  }
}
