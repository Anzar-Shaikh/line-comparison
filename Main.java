package com.bl.basic;

import java.util.Scanner;

class lines {
    public double line1(int x1, int y1, int x2, int y2){
        double length_of_line1= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Length of line 1 is : " + length_of_line1);
        return length_of_line1;
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length1;
        lines lines = new lines();
        int x11,y11,x21,y21;



        System.out.println("Enter line 1 co-ordinates : ");
        System.out.print("X1 : ");
        x11= sc.nextInt();
        System.out.println(" ");
        System.out.print("Y1 : ");
        y11= sc.nextInt();
        System.out.println(" ");
        System.out.print("X2 : ");
        x21= sc.nextInt();
        System.out.println("");
        System.out.print("Y2 : ");
        y21= sc.nextInt();
        System.out.println("");

        length1 = lines.line1(x11,y11,x21,y21);




    }
}
