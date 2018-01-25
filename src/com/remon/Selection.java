package com.remon;

/**
 * Created by Administrator on 2018-01-24.
 */
public class Selection {

    // 선택 정렬
    public Selection() {
    }

    public int[] sort(int[] data) {
        int[] result = new int[100];
        for (int i = 0; i < 100; i++) {
            result[i] = data[i];
        }
        int temp = 0;

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
