import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("Nhap vao chieu dai mang : ");
            size = input.nextInt();

            if (size > 20) {
                System.out.print("Vui long nhap so nho hon 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua mang : ");
            array[i] = input.nextInt();
        }

        System.out.println("Mang vua nhap la : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        System.out.println("Mang sau khi doi chieu la : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

