import java.util.*;
import java.lang.System;
import java.lang.String;

class KeybRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Welcome " + name + " to JAVA Training !!!");
    }
}