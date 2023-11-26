package OtherProject.hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class bt6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nguyen Viet Anh 20183479 - Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nguyen Viet Anh 20183479 - Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array);
        int sum = Arrays.stream(array).sum();
        double average = Arrays.stream(array).average().orElse(Double.NaN);
        System.out.println("Nguyen Viet Anh 20183479 - Sorted array: " + Arrays.toString(array));
        System.out.println("Nguyen Viet Anh 20183479 - Sum: " + sum);
        System.out.println("Nguyen Viet Anh 20183479 - Average: " + average);
    }
}
