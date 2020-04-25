package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=4536597;
        int i=0;
        int p=0;
        processNumber(n,i,p);
    }
    private static void processNumber(int n, int i, int p){
        if(n > 0){
            int c = n % 10;
            if(c % 2 == 0){
                p = p * 10 + c;
            }else i = i * 10 + c;
            n = n / 10;
            processNumber(n,i,p);
        }else {
            System.out.println("Cifre impare: "+ inverseNumber(i));
            System.out.println("Cifre pare: "+ inverseNumber(p));
        }
    }
    private static int inverseNumber(int n){
        int i = 0;
        while (n > 0){
            i = i * 10 + n % 10;
            n = n / 10;
        }
        return i;
    }
}
