package com.remon;

/**
 * Created by Administrator on 2018-01-24.
 */
public class Bubble {

    // 버블 정렬
    public Bubble() {
    }

    public int[] sort(int[] data) {
        int[] result = new int[100];
        for (int i = 0; i < 100; i++) {
            result[i] = data[i];
        }
        int temp = 0;

        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < result.length - i; j++) {
                if (result[j] > result[j + 1]) {
                    temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }
}
