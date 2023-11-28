package ex03;

import org.graalvm.nativeimage.hosted.RuntimeJNIAccess;

class SMIFileRunnable implements Runnable {
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

class VideoFileRunnable implements Runnable {
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

public class SecondWayToMakeThread {
  public static void main(String[] args) {
    Runnable smiFileRunnable = new SMIFileRunnable();
    Thread thread1 = new Thread(smiFileRunnable);
    thread1.start();

    Runnable videoFileRunnable = new VideoFileRunnable();
    Thread thread2 = new Thread(smiFileRunnable);
    thread2.start();
  }
}
