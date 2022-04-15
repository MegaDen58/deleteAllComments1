package com.company;
import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        FileWriter fileWriter = new FileWriter("output.txt");
        int k = 0;
        String text = "";
        while((k=fileReader.read()) != -1){
            text += (char)k;
        }

        String a = text.replaceAll("\\//.+", "");
        String b = a.replaceAll("/\\*(\r\n.+)*\\*/", "");
        String c = b.replaceAll("\\/\\*([\\S\\s]+)\\*\\/", "");
        fileWriter.write(c);
        fileWriter.flush();
    }
}