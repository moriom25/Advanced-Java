package JavaApplication13;

import java.io.*;

class athread extends Thread {
    String msg;

    public athread(String a) {
        msg = a;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JavaApplication13 {
    public static void main(String[] args) {
        athread a1 = new athread("Thread 1");
        a1.start();

        athread a2 = new athread("Thread 2");
        a2.start();
    }
}
