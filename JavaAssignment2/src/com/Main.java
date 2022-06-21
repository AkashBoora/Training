package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CountArray countArray = new CountArray();
        System.out.println("Does String Contains all alphabets? "+countArray.chekForAllAlphabets(input));

        // Time complexity O(n) and space complexity O(1)

        RegexReplace regexReplace = new RegexReplace();
        System.out.println("Does String Contains all alphabets? "+regexReplace.chekForAllAlphabets(input));
    }
}
