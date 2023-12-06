package OtherProject.hust.soict.dsai.lab01;
import java.util.Scanner;

public class bt6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nguyen Viet Anh 20183479 - Enter the number of rows and columns of the matrices: ");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] result = new int[size][size];
        System.out.println("Nguyen Viet Anh 20183479 - Enter the elements of the first matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nguyen Viet Anh 20183479 - Enter the elements of the second matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Nguyen Viet Anh 20183479 - Resultant matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        String[] a = {"b", "c"};

        scanner.close();
    }
}
