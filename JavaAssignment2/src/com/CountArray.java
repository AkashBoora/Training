package com;

import java.util.Locale;
import java.util.Scanner;

public class CountArray {
    public boolean chekForAllAlphabets(String string) {
        int[] count = new int[26];
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                count[string.charAt(i) - 97]++;
            }
        }
        for (int i = 0; i < 25; i++) {
            if (count[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
