package com;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File readfile = new File("readfile.txt");
        File writefile = new File("writefile.txt");

        HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

        getCharFrequency(readfile,frequencyMap);
        writeCharFrequency(writefile,frequencyMap);
        readCharFrequency(writefile,frequencyMap);
    }

    private static void readCharFrequency(File writefile, HashMap<Character, Integer> frequencyMap) {
        try {
            FileReader fileReader = new FileReader(writefile);
            int temp;
            while ((temp=fileReader.read()) != -1){
                System.out.print((char) temp);
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeCharFrequency(File writefile, HashMap<Character, Integer> frequencyMap) {
        try {
            FileWriter fileWriter = new FileWriter(writefile);
            for(char ch : frequencyMap.keySet()){
                fileWriter.write(ch+"\t"+frequencyMap.get(ch)+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getCharFrequency(File readfile, HashMap<Character, Integer> frequencyMap) {
        try{
            FileReader fileReader = new FileReader(readfile);
            int temp;
            while ((temp=fileReader.read()) != -1){
                char ch = (char) temp;
                if(frequencyMap.containsKey(ch)){
                    frequencyMap.put(ch,frequencyMap.get(ch)+1);
                }else{
                    frequencyMap.put(ch,1);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
