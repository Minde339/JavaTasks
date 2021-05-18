package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int size = b.nextInt();
        int[] test = new int[size];
        for(int x = 0; x<size; x++){
            test[x]=b.nextInt();
        }
        ArrayList<Integer> newray = new ArrayList<>(size);
        for(int i = test.length-1;i >= 0;i--){
            newray.add(test[i]);
        }
        String formattedString = newray.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();           //remove trailing spaces from partially initialized arrays
        System.out.print(formattedString);
    }

}
