package com.company;

public class Hesap {
    private int total;

    public Hesap(int total) {
        this.total = total;
    }
    public void yatır(int miktar){
        this.total+=miktar;
    }
    public void cek(int miktar){
        this.total-=miktar;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
