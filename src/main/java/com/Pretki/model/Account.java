package com.Pretki.model;

public class Account {
    private double sumOfMoney;
    private int number;

    public double getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(double sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sumOfMoney=" + sumOfMoney +
                ", number=" + number +
                '}';
    }
}
