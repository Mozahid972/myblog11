package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleTest {
    public static void main(String[] args) {
       // result = (condition) ? valueIfTrue : valueIfFalse;
        int a=10;
        int b=20;
        // Using ternary operator to find the maximum of two numbers
        int max=(a>b)?a:b;
        System.out.println("The Maximum number is "+max);
    }
}
