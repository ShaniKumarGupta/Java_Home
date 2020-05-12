package Searching;/* shani gupta 12-05-2020 23:25 12*/

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to be stored in Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = 0;
        System.out.println("Enter the element into an Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Please! Enter the number you wanted to be search :");
        int item = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("Number "+item+" is present at index "+i);
                temp+=1;
            }
        }
        if(temp == 0){
            System.out.println("Number is not present in an Array");
        }
    }
}
