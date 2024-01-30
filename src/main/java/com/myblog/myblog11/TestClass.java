package com.myblog.myblog11;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer>data= Arrays.asList(10,20,40,50,60,20,10);
        List<Integer>val=data.stream().distinct().collect(Collectors.toList());
        System.out.println(val);
        System.out.println("hello");

    }
}
