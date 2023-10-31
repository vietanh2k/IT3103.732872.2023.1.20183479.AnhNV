package lab01;

import java.util.Scanner;

public class DrawStar {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Num star = ");
        int num = keyboard.nextInt();
        for(int i=0; i< num; i++){
            String space = "";
            for(int j=0; j<num-i; j++){
                space += " ";
            }

            for(int j=num-i; j<=num + i; j++){
                space += "*";
            }
            System.out.println(space);
        }
    }
}
