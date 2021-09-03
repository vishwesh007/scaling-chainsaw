package com.company.ArrayHandlers;

import com.company.log;

import java.io.File;
import java.util.ArrayList;

public class ArrayToArrayList {


    public static void main(String[] args) {
        String[] arr = new String[]{"hi","helo"};
        log.log(get(arr));
    }


    public static ArrayList<String> get(String[] arr) {
        ArrayList<String> stringArrayList= new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            stringArrayList.add(arr[i]);
        }
        return stringArrayList;

    }
    public static ArrayList<Object> get(Object[] arr) {
        ArrayList<Object> stringArrayList= new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            stringArrayList.add(arr[i]);
        }
        return stringArrayList;

    }
    public static ArrayList<File> get(File[] arr) {
        ArrayList<File> stringArrayList= new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            stringArrayList.add(arr[i]);
        }
        return stringArrayList;

    }

    public static void iterate (ArrayList<File> arrayList){

        for (File s:arrayList){
            System.out.println(s.toString());
        }
    }
    public static void iterate (String[] arrayList){

        for (String s:arrayList){
            System.out.println(s);
        }
    }

}
