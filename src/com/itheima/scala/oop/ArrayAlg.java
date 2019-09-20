package com.itheima.scala.oop;

public class ArrayAlg {

    public  <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
    
    public static void main(String[] args){
//        System.out.println(ArrayAlg.getMiddle(1,2,3,4,5));
        ArrayAlg arrayAlg = new ArrayAlg();
        String abc = arrayAlg.getMiddle("abc");
        System.out.println(abc);
    }

}