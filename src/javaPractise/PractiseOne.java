package javaPractise;

//Take three numbers from the user and print the greatest number.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.lang.Math;

public class PractiseOne {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers on each lines");
        Scanner scan = new Scanner(System.in);

    // calculate which one is highest using Math.max
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());

        //Math.max only compares 2 values
        int max = Math.max(x,y);
        if(max>y){ //suppose x is max then compare x with z to find max number
            max = Math.max(x,z);
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.max(y,z);
        }
        System.out.println("The max of three numbers is: " + max);
    }
}
