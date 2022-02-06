package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class ParaYatır implements Runnable{
    private Customer customer;
    private int miktar;
    private ReentrantLock lock ;

    public ParaYatır(Customer customer, int miktar, ReentrantLock lock) {
        this.customer = customer;
        this.miktar=miktar;
        this.lock= lock;
    }

    @Override
    public void run() {
        lock.lock();
        this.customer.getHesap().yatır(miktar);
        lock.unlock();
        System.out.println(this.customer.getHesap().getTotal());
    }
}
