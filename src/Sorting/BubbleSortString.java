package Sorting;/* shani gupta 17-05-2020 00:51 17*/

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string to be store: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the Sting into Array String: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        System.out.println("Entered String:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Bubble Sort:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
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
