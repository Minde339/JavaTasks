//The even indices are , , and , and the odd indices are , , and .
// We then print a single line of  space-separated strings;
// the first string contains the ordered characters from 's even indices (),
// and the second string contains the ordered characters from 's odd indices ().
//
//Test Case 1:
//
//
//
//
//The even indices are  and , and the odd indices are  and .
// We then print a single line of  space-separated strings;
// the first string contains the ordered characters from 's even indices (),
// and the second string contains the ordered characters from 's odd indices ().

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        while(val != 0){
            String value = input.next();
            for(int i = 0; i < value.length(); i++){
                if(i % 2 == 0){
                    odd.append(value.charAt(i));
                } else {
                    even.append(value.charAt(i));
                }
            }
            String builded = odd + " " + even;
            System.out.println(builded);
            even.setLength(0);
            odd.setLength(0);
            val --;
        }
    }
}
