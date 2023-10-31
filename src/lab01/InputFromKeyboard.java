package lab01;

import javax.swing.*;
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("How tall are you?");
        double hei = keyboard.nextDouble();

        System.out.println("Mrs/Ms. "+ name+", "+ age + " years old. " + "Your height is "+hei+".");
    }
}
