package dataStructure.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pambast on 7/16/17.
 *
 * https://www.hackerrank.com/challenges/2d-array/problem
 *
 * There are  lines of input, where each line contains  space-separated integers describing 2D Array ;
 * every value in  will be in the inclusive range of  to .
 * Constraints
 * -9 <= A[i][j] <= 9
 * 0 <= i,j <= 5
 *
 * Output Format:
 *
 * Print the largest (maximum) hourglass sum found in .
 * Sample Input:

 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0

 * Sample Output:
 19
 */
public class ArraySumOfHourGlass {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int arr[][] = new int [6][6];
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        List<Integer> listOfSum = new ArrayList<Integer>();
        int count = 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                int sum1, sum2, sum3, sum;
                sum1 = arr[i][j] + arr[i][j+1]+arr[i][j+2];
                sum2 = arr[i+1][j+1];
                sum3 = arr[i+2][j] + arr[i+2][j+1]+arr[i+2][j+2];
                sum = sum1 + sum2 + sum3;
                listOfSum.add(sum);
//                System.out.println(listOfSum);
                count++;
            }

        }
        Collections.sort(listOfSum);
//        listOfSum.sort(Integer::compareTo); //Java 8
//        System.out.println("Sum: " + listOfSum + " and count is " + count);
        System.out.println(listOfSum.get(count-1));

    }


}
