/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5q3;

/**
 *
 * @author mhmdd
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class HTMLChecker{
    
    public static void Check(File file){
        try{
            Scanner scanner = new Scanner(file);
            MyStack tagStack = new MyStack();
            boolean errorDetected = false;
            
            while(scanner.hasNextLine() && !errorDetected){
                String line = scanner.nextLine().trim();
                if(line.startsWith("<!DOCTYPE html>")) continue;
                
                String[] tokens = line.split("[<>]");
                    outerLoop:
                    for(String token : tokens) if(!token.isEmpty()) 
                        if(!token.equalsIgnoreCase("My First Heading") && !token.equalsIgnoreCase("My first paragraph."))
                        if(token.startsWith("/")){
                            String tag = token.substring(1);
                            if(tag.equals(tagStack.peek())){
                                System.out.println("Found an ending tag: " + token.substring(1));
                                System.out.println("The ending tag is correct");
                                tagStack.pop();
                                System.out.println("Current Stack: [ " + tagStack.toString() + "]");
                                System.out.println("");
                            }
                            else if(!tag.equals(tagStack.peek())) {
                                System.out.println("Found and ending tag: " + tag);
                                System.out.print("Error: ");
                                System.out.println("Current Stack: [ " + tagStack.toString() + "]");
                                System.out.println("");
                                errorDetected = true;
                                break outerLoop;
                            }
                        }else if(!token.startsWith("/")){
                            System.out.println("Pushing into stack: " + token);
                            tagStack.push(token);
                            System.out.println("Current Stack: [ " + tagStack.toString() + "]");
                            System.out.println("");
                        }
            }
            System.out.println("Is the html file correct? " + tagStack.isEmpty()); 
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}

public class LAB5Q3 {

    public static void main(String[] args) {
        File sample1 = new File("C:\\Users\\mhmdd\\OneDrive\\Desktop\\Prog\\New Folder\\LAB5Q3\\sample.txt");
        File sample2 = new File("C:\\Users\\mhmdd\\OneDrive\\Desktop\\Prog\\New Folder\\LAB5Q3\\sample2.txt");
        File sample3 = new File("C:\\Users\\mhmdd\\OneDrive\\Desktop\\Prog\\New Folder\\LAB5Q3\\sample3.txt");
                
//        HTMLChecker.Printer(sample1);
        HTMLChecker.Check(sample1);
//        HTMLChecker.Check(sample2);
//        HTMLChecker.Check(sample3);
        
    }
    
}
