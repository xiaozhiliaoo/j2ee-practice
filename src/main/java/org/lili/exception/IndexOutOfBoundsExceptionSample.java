package org.lili.exception;

/**
 * @author lili
 * @date 2020/2/29 14:33
 * @description
 * @notes
 */

public class IndexOutOfBoundsExceptionSample {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(arr[8]);
    }
}
