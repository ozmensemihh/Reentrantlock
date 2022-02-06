package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class Customer {
    private Hesap hesap;

    public Customer(Hesap hesap) {
        this.hesap = hesap;
    }

    public Hesap getHesap() {
        return hesap;
    }

    public void setHesap(Hesap hesap) {
        this.hesap = hesap;
    }
}
