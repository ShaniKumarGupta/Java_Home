package Searching;/* shani gupta 13-05-2020 00:05 13*/

import java.util.Scanner;

public class BinarySearch {

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r-l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to be stored: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int l=0;
        int r = n - 1;
        System.out.println("Enter the number into array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be search: ");
        int data = sc.nextInt();
        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(arr,data);
        if(result == -1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at index: "+ result);
        }
    }
}
