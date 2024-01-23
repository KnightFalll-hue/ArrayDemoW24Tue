/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author michael
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        
        String myword = input.nextLine();
        
        char[] myLetters = new char[myword.length()];
    
        for (int i=0; i<myword.length(); i++){
            myLetters[i]=myword.charAt(i);
        }
        
        System.out.println("Printing in reverse");
        
        for(int i=myLetters.length-1; i>=0; i--){
            System.out.println(myLetters[i]);
        }
    }
    
}
