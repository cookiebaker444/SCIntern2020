package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printString("feedthedog");
    }
    private static String printString(String s){
        if (s == null || s.length() <= 1) return s;
        int len = s.length();
        int row = (int) Math.sqrt(len);
        int col =(int) Math.round((double)len/(double)row);
        if (row * col < len){
            col += 1;
        }
        ArrayList<Character> res = new ArrayList<>();
        for (int i = 0;i < col; i ++){
            for (int j = 0; j < row; j ++){
                if ((col) * j + i < len){
                    res.add(s.charAt((col)*j + i));
                    if (j == row - 1){
                        res.add(' ');
                    }
                }
                else{
                    res.add(' ');
                    break;
                }

            }

        }
        for (int i = 0; i < res.size(); i ++){
            System.out.print(res.get(i));
        }

        System.out.println(len);
        System.out.println(row);
        System.out.println(col);
        //return s;
        return res.toString();

    }
}
