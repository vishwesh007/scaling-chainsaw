package com.company;

import java.io.*;

public class test {

    public static void main(String[] args) throws IOException {
        String filepath ="C:\\Users\\tech buddy\\Desktop\\New Text Document (3).txt";
        File f= new File(filepath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        StringBuilder
                stringBuilder= new StringBuilder();

       log.log(stringBuilder.toString());
        // stringBuilder.append(bufferedReader.lines());
    }
}
