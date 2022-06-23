package com;

import java.util.Locale;

public class RegexReplace {

    public boolean chekForAllAlphabets(String input) {
        System.out.println(input.toLowerCase()
                .replaceAll("[^a-z]","")
                .replaceAll("(.)(?=.*\\1)",""));
        return input.toLowerCase()
                .replaceAll("[^[a-z]]","")
                .replaceAll("(.)(?=.*\\1)","")
                .length()==26;
    }
}
