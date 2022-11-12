import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("Введіть розмір масиву: ");
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
}
