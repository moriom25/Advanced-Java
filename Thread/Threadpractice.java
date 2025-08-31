package threadpractice;

import java.io.*;

class athread extends Thread {
    String msg;

    public athread(String a) {
        msg = a;
    }

    public void run() {
        System.out.println(msg);
    }
}

public class Threadpractice {
    public static void main(String[] args) {
        athread a1 = new athread("Moriom Khondoker Munni");
        a1.start();

        athread a2 = new athread("0272130005101101");
        a2.start();
        
        athread a3 = new athread("58(B)");
        a3.start();
    }
}
