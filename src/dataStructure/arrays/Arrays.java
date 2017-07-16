package dataStructure.arrays;

import java.util.Scanner;

/**
 * Created by pambast on 7/15/17.
 *
 * https://www.hackerrank.com/challenges/arrays-ds
 *
 * Output Format
 * Print all  integers in  in reverse order as a single line of space-separated integers.
 * Sample Input
 * 4
 * 1 4 3 2
 * Sample Output
 * 2 3 4 1
 *
 */
public class Arrays {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
//            System.out.println(arr[i]);
        }

        // Sol 1
        /*
        int[] newArr = new int[n];
        for (int j=0; j<n;j++){
            newArr[j]=arr[n-j-1];
            System.out.print(newArr[j] + " ");
        }
        */

        // Sol 2

        for (int j=n-1; j>=0; j--){
            System.out.print(arr[j] + " ");
        }

    }


}
