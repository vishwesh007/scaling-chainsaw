package com.company;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Matcher1 {

    //regex test pattern matcher


    public  String example ="this is hi" +
            "\nhellohiesett" +
            "my small example";
//TODO:add case sensitivity and whole word search
    public ArrayList<String> match =new ArrayList<>();
    public void main(String skpat){

        Pattern pattern =Pattern.compile(skpat,Pattern.CASE_INSENSITIVE);
        java.util.regex.Matcher matcher = pattern.matcher(example);
        while (matcher.find()){
           // System.out.println(matcher.find());
            match.add(matcher.group());
          //  System.out.println(matcher.groupCount());


        }
     //   System.out.println("start");
        for(String s: match){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
       // System.out.println("start");
        Matcher1 matcher1 = new Matcher1();
        matcher1.main("hi.");
    }
}
