package com.Aleksey;
import java.io.*;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("enter the sentence ");
        String pr = p.nextLine();
        System.out.println("enter the word ");
        String sl = p.nextLine();
        int pos = 0, count = 0;
        do {
            pos = pr.indexOf(sl, pos);
            if (pos >= 0) {
                count ++;
                pos += sl.length();
            }
        } while (pos >= 0);
        System.out.println("sentence: "+pr+". word: "+sl+". " +
                "count of word: "+count);
    }
}
