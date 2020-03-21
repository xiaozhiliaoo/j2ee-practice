package org.lili.exception.nest;

/**
 * @author lili
 * @date 2020/2/29 15:51
 * @description
 * @notes
 */

public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
        System.out.println("MyCheckedException:"+message);
    }
}
