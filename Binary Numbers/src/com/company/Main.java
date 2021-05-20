//Objective
//Today, we're working with binary numbers.
// Check out the Tutorial tab for learning materials and an instructional video!
//
//Task
//Given a base- 10 integer,n , convert it to binary (base-2).
// Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
// When working with different bases, it is common to show the base as a subscript.
//
//Example
//
//The binary representation of 125 is 1111101 . In base 10, there are 5 and 1 consecutive ones in two groups.
// Print the maximum, 5.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skaicius = new Scanner(System.in);
        int n = skaicius.nextInt();
        int pasikartojantisCounter = 0;
        int paskutinisCounter = 0;

        skaicius.close();
	    while (n>0){
	        // Isvedame 10 taini skaiciu i dvejataini
	        int remainder = n % 2;
	        n = n/2;
            if(remainder == 1){
                pasikartojantisCounter++;
            } else {
                pasikartojantisCounter = 0;
            }
            if(pasikartojantisCounter > paskutinisCounter){
                paskutinisCounter = pasikartojantisCounter;
            }
        }
        System.out.println(paskutinisCounter);

    }
}
