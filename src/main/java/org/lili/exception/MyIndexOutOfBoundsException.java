package org.lili.exception;

/**
 * @author lili
 * @date 2020/2/29 14:45
 * @description
 * @notes
 */

public class MyIndexOutOfBoundsException extends IndexOutOfBoundsException {
    //下界
    private int lowBound;
    //上界
    private int upperBound;
    //超出索引
    private int index;

    public MyIndexOutOfBoundsException(int lowBound, int upperBound, int index) {
        //super("Lower bound:" + lowBound + ",Upper bound:" + upperBound + ",Index:" + index);
        this.lowBound = lowBound;
        this.upperBound = upperBound;
        this.index = index;
    }


    public static void main(String[] args) {
        throw new MyIndexOutOfBoundsException(1, 5, 7);
    }

//    @Override
//    public String toString() {
//        return "MyIndexOutOfBoundsException{" +
//                "lowBound=" + lowBound +
//                ", upperBound=" + upperBound +
//                ", index=" + index +
//                '}';
//    }
}
