package ru.android_group.dmtou.calc;

/**
 * Created by DmTou on 11.05.2016.
 */


public class Calculation {
    int xint1, xint2 = 0;
    double xdb1, xdb2 = 0.0;

    public int calcSumma(int x1,int x2){
        return x1+x2;
    }

    public double calcSumma(double x1, double x2) {
        return x1+x2;
    }

    public int calcMult(int x1,int x2) {
        return x1*x2;
    }

    public double calcMult(double x1,double x2) {
        return x1*x2;
    }
}
