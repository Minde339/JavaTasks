package com.company;

public class Main {

    public static void main(String[] args) {
	solve(10.25, 17, 5);
    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost/100*tip_percent;
        double tax = meal_cost/100*tax_percent;
        int total_cost = (int)(Math.round(meal_cost+ tip + tax));
        System.out.println(total_cost);
    }
}


