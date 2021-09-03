package com.company;

import com.company.ArrayHandlers.ArrayToArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
class  Threading extends Thread{
    File f;
    Threading(File f){
        super("Threads");
        this.f=f;

        start();
    }
    public void run(){
        if(! Recursion5.Dirs.isEmpty() && (f.getAbsolutePath() != null)) {
            Recursion5 recursion5 = new Recursion5(f.getAbsolutePath());
            Recursion5.Dirs.remove(f);
            recursion5.main();
        }
    }

}
public class Recursion5 {
    static File file;
   public Recursion5(String pathTodir){
       file=new File(pathTodir);
   }
    public static ArrayList<File> Dirs= new ArrayList<>();
    public static ArrayList<File> files=new ArrayList<>();
    public static void main() {
         ArrayList<File> filesTemp=ArrayToArrayList.get(file.listFiles()) ;
       if(file.isDirectory()) {
          filesTemp= ArrayToArrayList.get(file.listFiles()) ;
       }
       for(File f: filesTemp){
           if(f.isDirectory()){
               Dirs.add(f);
           }
           if (f.isFile()){
               files.add(f);
           }
         // filesTemp.remove(f);

    }
    if(Dirs.isEmpty()){

        }else {

        for (File f:Dirs){
            //new Threading(f);
            Recursion5 recursion5 = new Recursion5(f.getAbsolutePath());
            Recursion5.Dirs.remove(f);
            recursion5.main();
                //had recently encountered with exception named concurrent modification exception this exception is caused due to null pointer
            //exception during runtime a typical case is this one bug was fixed by adding below to line of cod
           if(Dirs.isEmpty())
                break;




        }




    }

    }

    public static void main(String[] args) {
       Recursion5 recursion5= new Recursion5("D:\\ApkRepack\\ApkRepacker-master\\app\\src\\main\\java");
       recursion5.main();

//    try {
//        Thread.sleep(5000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }

        ArrayList<String>  filepaths=new ArrayList<>();
for (File f: files){
  String s=  f.getAbsolutePath();
filepaths.add(s);
   System.out.println(s);
}
multipleFiles4.filepaths=filepaths;
        try {
            multipleFiles4.main(filepaths,"(?s)hi.+\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
