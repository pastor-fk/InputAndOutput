package createfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class BasecFile implements Serializable {

    public static void main(String[] args) {
        File file=new File("text.txt");
        InputStreamReader put=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(put);
        
        String details="";
        String number="";
        //write to the file
        PrintWriter output;
        try {
            output = new PrintWriter(file);
            System.out.println("Please enter name and surname "+"\n");
           details=buf.readLine();
            System.out.println("Please enter age "+"\n");
            number=buf.readLine();
            output.println(details);
            output.println(number);
            output.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.printf("Error: %s\n ",e);
        }
        
        try{
        //read to a filee
        Scanner input=new Scanner(file);
        String name=input.nextLine();
        int age=input.nextInt();
        
        System.out.printf("Name: %s Age  %d",name,age);
        }catch(FileNotFoundException e){
            System.out.println("ERROR: "+"please choose a different file ");
        }
    }

}
