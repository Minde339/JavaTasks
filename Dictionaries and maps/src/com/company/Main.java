//Task
//Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You
// will then be given an unknown number of names to query your phone book for.
// For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
// if an entry for  is not found, print Not found instead.
//
//Note: Your phone book should be a Dictionary/Map/HashMap data structure.
//
//Input Format
//
//The first line contains an integer, , denoting the number of entries in the phone book.
//Each of the  subsequent lines describes an entry in the form of  space-separated values on a single line.
// The first value is a friend's name, and the second value is an -digit phone number.
//
//After the  lines of phone book entries, there are an unknown number of lines of queries.
// Each line (query) contains a  to look up, and you must continue reading lines until there is no more input.
package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> numbers = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            numbers.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(numbers.get(s) != null){
                System.out.println(s+"="+numbers.get(s));
            } else {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}
