package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
        public static int factorial(int n) {
            int x = n-1;
            if(x > 0){
                return n * factorial(x);
            } else {
                return n;
            }
        }
}
