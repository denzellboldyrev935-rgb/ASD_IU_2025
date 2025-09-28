/*
Обязательное задание.
Релизовать алгоритм бинарного поиска двумя способами:
1) через цикл
2) рекурсивно
 */
import java.util.Scanner;

public class Binsearch {
    public static int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements?:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements from min to max:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void outputArr(int[] arr){
        System.out.println("Your array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int searchIterative(int[] arr, int el){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == el){
                return mid;
            }
            else if (arr[mid] < el) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int searchRecursive(int[] arr, int el, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == el){
            return mid;
        }
        else if (arr[mid] < el) {
            return searchRecursive(arr, el, mid + 1, right);
        }
        else{
            return searchRecursive(arr, el, left, mid - 1);
        }
    }

    public static void main(String[] args){
        int[] arr = inputArr();
        outputArr(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the searching element:");
        int el = sc.nextInt();

        int resultiter = searchIterative(arr, el);
        if(resultiter == -1){
            System.out.println("Element wasn't found using Iterative method");
        }
        else{
            System.out.println("Element was found using Iterative method, index: " + resultiter);
        }

        int resultrec = searchRecursive(arr, el, 0, arr.length - 1);
        if(resultrec == -1){
            System.out.println("The element wasn't found using Recursive method");
        }
        else{
            System.out.println("Element was found by Recursive Method ,  index: " + resultrec);
        }
    }
}


