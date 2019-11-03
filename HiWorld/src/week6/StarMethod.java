package week6;

import week4.Console;

public class StarMethod {
    static void starRequest(int row, int column){
        System.out.println("Pattern using *");
        System.out.println("-------------");
        for (int i=0; i<row;i++){
            for (int j=0; j<column; j++){
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
    }
    public static void main (String[] args){
        Console console=new Console();
        int row=console.askInt("How many rows do you want? ");
        int column=console.askInt("How many column do you want? ");
        starRequest(row,column);
    }
}
