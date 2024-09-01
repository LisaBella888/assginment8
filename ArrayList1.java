import java.util.Scanner;

public class ArrayList1 {

    // Method to input array data
    public static int[] inputData(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Method to print array data
    public static void printData(int[] arr) {
        System.out.println("MẢNG VỪA NHẬP LÀ: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to find the second largest number in the array
    public static void findMax2(int[] arr) {
        if (arr.length < 2) {
            System.out.println("MẢNG CẦN CÓ ÍT NHẤT 2 PHẦN TỬ.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("KHÔNG CÓ SỐ LỚN THỨ 2.");
        } else {
            System.out.println("SỐ LỚN THỨ 2 LÀ: " + max2);
        }
    }

    // Method to delete and print odd numbers in the array
    public static void deleteOddNumber(int[] arr) {
        System.out.print("SỐ LẺ TRONG MẢNG LÀ: ");
        boolean hasOdd = false;

        for (int number : arr) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                hasOdd = true;
            }
        }

        if (!hasOdd) {
            System.out.println("KHÔNG CÓ SỐ LẺ NÀO.");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO CHƯƠNG TRÌNH CỦA HÙNG.");
        System.out.println("1. TÌM MAX 2 TRONG MẢNG");
        System.out.println("2. XUẤT PHẦN TỬ LẺ");
        System.out.print("CHỌN MỘT TÙY CHỌN: ");
        int choice = sc.nextInt();

        System.out.print("NHẬP KÍCH THƯỚC PHẦN TỬ: ");
        int n = sc.nextInt();
        int[] arr = inputData(n);
        printData(arr);

        switch (choice) {
            case 1:
                findMax2(arr);
                break;
            case 2:
                deleteOddNumber(arr);
                break;
            default:
                System.out.println("KHÔNG CÓ TRONG TÙY CHỌN.");
        }
    }
}