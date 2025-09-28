/*
Дан целочисленный массив. Верните число, частота встречи которого в
массиве равна его значению. Если таких чисел нет, вернуть «-1». Если
таких чисел несколько, вернуть наибольшее.
 */
import java.util.Scanner;
public class Task4 {
    public static int[] inputArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void outputArr(int[] arr) {
        System.out.print("Массив: ");
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static int findNumber(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == arr[i] && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArr();
        outputArr(arr);
        int res = findNumber(arr);
        System.out.println("Результат: " + res);
    }
}

