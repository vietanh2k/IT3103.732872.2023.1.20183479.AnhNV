package OtherProject.hust.soict.dsai.lab01;
import java.util.Scanner;

public class bt6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nguyen Viet Anh 20183479 - Enter the height of the triangle: ");
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
