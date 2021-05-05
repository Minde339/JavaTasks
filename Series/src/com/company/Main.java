package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            ArrayList<Integer> Values = new ArrayList<>();
            for(int c=0; c < n; c++){
                int d = c;
                double result = 0;
                while (d != 0) {
                    result += Math.pow(2,d)*b;
                    d--;
                }
                int oneval = (int) (a+result+b);
                Values.add(c,oneval);
            }
            String formattedString = Values.toString()
                    .replace(",", "")
                    .replace("[","")
                    .replace("]","")
                    .trim();
            System.out.println(formattedString);
        }
        in.close();
    }
}
