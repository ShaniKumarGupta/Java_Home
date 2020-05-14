package Sorting;/* shani gupta 13-05-2020 20:23 13*/

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to be store in an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in an Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Element: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("After Bubble Sort: ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
