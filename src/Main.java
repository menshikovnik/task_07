import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getFactorial();
//        Scanner scanner = new Scanner(System.in);
//        int[] myArray;
//        myArray = new int[10];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = scanner.nextInt();
//        }
    }
    public static void getFactorial() {
        long result = 1;
        long sum = 0;
        int [] myArray = new int [] {120, 6, 12, 15, 479001600};
        for (int i = 1;i <= 63; i++) {
            result = result * i;
            for (int j = 0;j < myArray.length;j++){
               if (myArray[j] == result){
                   sum += myArray[j];
               }
            }
        }
        System.out.println(sum);
    }

//
//    public static boolean check (int [] arr){
//        if ()
//    }
}
