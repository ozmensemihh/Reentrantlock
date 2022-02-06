package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Hesap hesap = new Hesap(1000);
        Customer customer  =new Customer(hesap);
        new Thread(new Paracek(customer,50,lock)).start();
        new Thread(new ParaYatır(customer,150,lock)).start();

    }

}
