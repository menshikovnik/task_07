import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        System.out.println("Сумма равна: " + inputValue());
    }

    public static long Solution(long[] arr) {
        long sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (isFactorial(arr[j])) {
                sum += arr[j];
            }
        }
        return sum;
    }

    public static long inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        final int SIZE = sc.nextInt();
        long[] myArray = new long[SIZE];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Введите элемент массива номер " + i + ": ");
            myArray[i] = sc.nextInt();
        }
        return Solution(myArray);
    }

    static boolean isFactorial(long n) {
        for (int i = 1; ; i++) {
            if (n % i == 0) {
                n /= i;
            } else {
                break;
            }
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void test1() {
        long sum = 0;
        int [] a = new int[]{2, 6, 24, 120};
        System.out.println(Arrays.toString(a));
        for (int j = 0; j < a.length; j++) {
            if (isFactorial(a[j])) {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
    public static void test2() {
        int [] a = new int[]{3, 7, 25, 121};
        System.out.println(Arrays.toString(a));
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            if (isFactorial(a[j])) {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
    public static void test3() {
        int [] a = new int[]{3, 6, 24, 121};
        System.out.println(Arrays.toString(a));
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            if (isFactorial(a[j])) {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
    public static void test4() {
        int [] a = new int[]{1, 1};
        System.out.println(Arrays.toString(a));
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            if (isFactorial(a[j])) {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
    public static void test5() {
        int [] a = new int[]{1, 1, 6, 6};
        System.out.println(Arrays.toString(a));
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            if (isFactorial(a[j])) {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
    public static void test6() {
        int [] a = new int[]{1, 1, 7, 5040};
        System.out.println(Arrays.toString(a));
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            if (isFactorial(a[j])) {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
}
