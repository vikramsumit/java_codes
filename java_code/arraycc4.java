// package com.example;

import java.util.*;

public class arraycc4 {
    // public static int linearSearch(int[] numbers, int key) {
    //     for (int i = 0; i < numbers.length; i++) {
    //         if (numbers[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int linearSearch(String[] array, String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] fruits = {"raja", "khaja", "bamd", "baja"};
        String key = "raja";

        int index = linearSearch(fruits, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index: " + index);
        }
    }
}
