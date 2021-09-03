package com.company;

import java.io.*;

public class filePROCESS2 {
    public static void main(String[] args) {
        String filepath="C:\\Users\\tech buddy\\Desktop\\New Text Document (3).txt";
        main(filepath,"hi");
    }
    public static void main(String filepath,String patt) {
        Matcher1 matcher1 = new Matcher1();
        File f= new File(filepath);
        try {
              BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            StringBuilder
                    stringBuilder= new StringBuilder();
            String message;
            while ((message=bufferedReader.readLine()) != null)
                stringBuilder.append(message);
      matcher1.example=stringBuilder.toString();
              log.log("THIS is conten////////////////////////////////////////////////////////// \n\n"+filepath+"\n\n" +
                      "//////////////////////////////////////////////////////////////content ends here");
      matcher1.main(patt);

       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
