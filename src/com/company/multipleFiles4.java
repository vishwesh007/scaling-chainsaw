package com.company;

import com.company.ArrayHandlers.ArrayToArrayList;

import java.util.ArrayList;

public class multipleFiles4 {
  public  static ArrayList<String>  filepaths ;
   // private static Object ArrayList;


    public static void main(String[] args) throws InterruptedException {
        String pattern="hi";

        filepaths= ArrayToArrayList.get(new String[]{fileExample.file1, fileExample.file2});
        main(filepaths,pattern);
    }

    public static void main(ArrayList<String>filepaths,String pattern ) throws InterruptedException {
        TRNHelper1.counts =1;
        for (String filepath: filepaths)
        if (TRNHelper1.counts>=10){
            Thread.sleep(3000);
        }else {
            if(!filepath.isEmpty())
            new multiTreads3(filepath,pattern);
            TRNHelper1.counts++;
           // if(!filepaths.isEmpty())
            //filepaths.remove(filepath);

        }

    }
}
