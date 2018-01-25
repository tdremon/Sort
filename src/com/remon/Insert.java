package com.remon;

/**
 * Created by Administrator on 2018-01-24.
 */
public class Insert {

    //»ğÀÔ Á¤·Ä
    public Insert() {}

    public int[] sort(int[] data) {
        int[] result = new int[100];
        for (int i = 0; i < 100; i++) {
            result[i] = data[i];
        }
        int num;
        int target = 0;
        boolean check = false;

        for (int i = 1; i < result.length; i++) {
            num = result[i];
            for (int j = i - 1; j >= 0; j--) {
                if (num < result[j]) {
                    result[j + 1] = result[j];
                    check = true;
                    target = j;
                } else {
                    break;
                }
            }
            if (check) {
                result[target] = num;
                check = false;
            }
        }
        return result;
    }

}
