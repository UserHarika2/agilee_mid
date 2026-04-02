package com.example;

public class App {

    public static boolean isEligible(int marks, double income, String caste) {

        if (marks >= 75 && income <= 250000) {
            if (caste.equalsIgnoreCase("SC") || 
                caste.equalsIgnoreCase("ST") || 
                caste.equalsIgnoreCase("OBC")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int marks = 80;
        double income = 200000;
        String caste = "OBC";

        if (isEligible(marks, income, caste)) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible");
        }
    }
}