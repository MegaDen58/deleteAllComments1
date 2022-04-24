package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fileReader = new FileReader("input.txt");
            int k = 0;
            String text = "";
            while((k = fileReader.read()) != -1){
                text += (char)k;
            }

            String a = text.replaceAll("\\//.+", "");
            String c = a.replaceAll("/\\*(?s).*?\\*/", "");

            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(c);
            fileWriter.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
