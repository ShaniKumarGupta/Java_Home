package Searching;/* shani gupta 14-05-2020 16:05 14*/

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchString {

    public static int binarySearchString(String[] arr, String data){
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            int res = data.compareTo(arr[mid]);

            if(res == 0){
                return mid;
            }
            if( res > 0 ){
                l = mid + 1;
            }
            else
                r = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string to be store: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the string:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the String to be Search: ");
        String data = sc.next();
        BinarySearchString ob = new BinarySearchString();
        int result = ob.binarySearchString(arr,data);
        if(result == -1){
            System.out.println("String element not found");
        }else{
            System.out.println("String "+data+" found at index "+result);
        }
    }
}
