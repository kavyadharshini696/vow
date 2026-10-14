package com.example;
public class VowelCount {
    public static int count(String s) {
        int total = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(count("Hello World"));
    }
}