package Arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class arraylistExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array list
        ArrayList<Integer>List = new ArrayList<>(); // defining arraylist
        // input
        for(int i = 0;i<5;i++){
            List.add(in.nextInt());
        }
        // get item at index
        for (int i = 0;i<5;i++) {
            System.out.println(List.get(i));
        }
        System.out.println(List);
        in.close();
    }
}
