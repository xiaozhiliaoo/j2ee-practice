package org.lili.exception.spring;

import java.util.Iterator;

/**
 * @author lili
 * @date 2020/2/29 15:15
 * @description
 * @notes
 */

public class MyException extends NestedRuntimeException {

    public MyException(String s) {
        super(s);
    }

    public static void main(String[] args) {
        MyException hi = new MyException("hi");
        hi.printStackTrace();
        throw hi;
    }
}
