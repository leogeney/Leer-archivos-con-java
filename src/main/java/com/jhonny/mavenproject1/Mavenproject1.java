
package com.jhonny.mavenproject1;

import java.io.FileReader;
import java.io.IOException;


public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
     
        
        
        String path = "./data.txt";
        FileReader fileReader = null;
        
        try{
        
        fileReader = new FileReader(path);
        
        int value = fileReader.read();
        
        while(value !=-1){
            System.out.print((char)value);
            value = fileReader.read();
        }
        }catch(IOException e){
            System.out.print("ha ocurrido un error");
        }finally{
        
        if(fileReader != null){
        fileReader.close();
        
        }
        }
        
        
    }
}
