package com.remon;

import java.util.Random;

public class Main {

    private int size = 100;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        int[] data01 = new int[size];
        int[] data02 = new int[size];
        int[] data03 = new int[size];
        int[] result = new int[size];

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            data01[i] = rand.nextInt(size);
            data02[i] = rand.nextInt(size);
            data03[i] = rand.nextInt(size);
        }
        print(data01);
        print(data02);
        print(data03);

        System.out.println("### Bubble Sort");
        Bubble bubble = new Bubble();
        print(bubble.sort(data01));
        print(bubble.sort(data02));
        print(bubble.sort(data03));
        System.out.println("### Selection Sort");
        Selection selection = new Selection();
        print(selection.sort(data01));
        print(selection.sort(data02));
        print(selection.sort(data03));
        System.out.println("### Insertion Sort");
        Insert insert = new Insert();
        print(insert.sort(data01));
        print(insert.sort(data02));
        print(insert.sort(data03));
    }

    public void clear(int[] data) {
        for (int i = 0; i < size; i++) {
            data[i] = -1;
        }
    }

    public void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
