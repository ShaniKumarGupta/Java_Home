package Searching;/* shani gupta 12-05-2020 23:52 12*/

import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of string to be stored in Array :");
        int n = sc.nextInt();
        String[] arr = new String[n];
        int temp = 0;
        System.out.println("Enter the string into Array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }

        System.out.println("Enter the string to be search :");
        String str = sc.next();

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(str)){
                System.out.println("String "+str+" found at index "+i);
                temp+= 1;
                break;
            }
        }
        if(temp == 0){
            System.out.println("String not present in an Array");
        }
    }
}
