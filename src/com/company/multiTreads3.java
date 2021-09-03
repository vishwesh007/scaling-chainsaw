package com.company;

public class multiTreads3 implements Runnable{
    Thread thread;
    String filePath ="C:\\Users\\tech buddy\\Desktop\\New Text Document (3).txt";
    private String pattern;

    public multiTreads3(String filePath,String pattern){
        this.filePath=filePath;
        this.pattern=pattern;
        thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            filePROCESS2.main(filePath,pattern);
            TRNHelper1.counts--;
        }catch (Exception e){
            log.log(e.getClass().toGenericString());
        }

    }
}
