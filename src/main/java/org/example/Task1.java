package org.example;

public class Task1 {
    public static void main(String[]args){
        int [] array = new int[3];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        for (int i = 0; i < array.length; i++){
            System.out.println("Element at index"+i+array[i]);
        }
    }
}
