package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Paracek implements Runnable{
    private Customer customer;
    private int miktar;
    private ReentrantLock lock;

    public Paracek(Customer customer, int miktar, ReentrantLock lock) {
        this.customer = customer;
        this.miktar=miktar;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        this.customer.getHesap().cek(miktar);
        lock.unlock();
        System.out.println(this.customer.getHesap().getTotal());
    }
}
