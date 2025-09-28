/*
3 Дан массив целых чисел. Минимальное количество элементов – 5 Вернуть
число, которое является суммой двух наименьших положительных чисел.
 */
import java.util.Scanner;
public class Task3{
    public static int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов");
        int n;
        do{
            System.out.println("Введите количество элементов:");
            n = sc.nextInt();
        } while(n<5);
        int[]  arr = new int[n];
        System.out.println("Введите элементы массива:");
        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void outputArr(int[] arr){
        System.out.println("Ваш массив:");
        for( int i = 0;i <arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int elInArr(int [] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min1 && arr[i]> 0){
                min1 = arr[i];
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i]>0 && arr[i]!= min1 && arr[i]<min2){
                min2 = arr[i];
            }
        }
        if (min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) {
            return -1;
        }
        return min1 + min2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = inputArr();
        outputArr(arr);
        int result = elInArr(arr);
        if (result == -1) {
            System.out.println("В массиве меньше двух положительных чисел");
        } else {
            System.out.println("Сумма двух наименьших положительных чисел: " + result);
        }
    }
}