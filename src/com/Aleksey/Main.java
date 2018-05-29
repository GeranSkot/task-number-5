package com.Aleksey;
import java.io.*;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Scanner o = new Scanner(System.in);

        System.out.println("sentence");
        String predl = p.nextLine();

        System.out.println("put your word r0ight heeere");
        String slovo = o.nextLine();

        int pos = 0, count = 0;
        do {
            pos = predl.indexOf(slovo, pos);
            if (pos >= 0) {
                count ++;
                pos += slovo.length();
            }
        } while (pos >= 0);

        System.out.println("sentence: "+predl+". word: "+slovo+". " +
                "count of word: "+count);
    }
}
