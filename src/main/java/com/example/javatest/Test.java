package com.example.javatest;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 已知数组（12，23，26，45，58，60）是有序的，输入一个数 x，将它插入到数组中，保证数组仍然是有序的。
 */
public class Test {

    public static void main(String[] args) {

        int[] numbers = {12, 23, 26, 45, 58, 60};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数x：");
        int x = input.nextInt();
        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        numbers[numbers.length - 1] = x;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }


}

