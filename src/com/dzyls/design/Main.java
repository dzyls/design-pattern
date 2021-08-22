package com.dzyls.design;

public class Main {

    public static void main(String[] args) {
        Object obj = "1";
        for (int i = 0; i < 200000; i++) {
            try {
                Integer num = (Integer) obj;
            }catch (Exception e){
                System.err.println("i : " + i);
                e.printStackTrace();
            }
        }
    }
}
