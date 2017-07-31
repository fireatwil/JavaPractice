package algorithms;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pambast on 7/16/17.
 *
 * https://www.hackerrank.com/challenges/compare-the-triplets
 *
 * Input Format

 The first line contains  space-separated integers, , , and , describing the respective values in triplet .
 The second line contains  space-separated integers, , , and , describing the respective values in triplet .
 If , then Alice is awarded  point.
 If , then Bob is awarded  point.
 If , then neither person receives a point.

 Constraints:
 1 <= ai <= 100
 1 <= bi <= 100

 Output Format:
 Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

 Sample Input:
 5 6 7
 3 6 10

 Sample Output:
 1 1

 */
public class CompareTheTriplets {


    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        List<Integer> alice = new ArrayList<Integer>();
        List<Integer> bob = new ArrayList<Integer>();

        if (a0 > b0){
            alice.add(1);
        }else if (a1==b1){

        }
        else{
            bob.add(1);
        }

        if (a1 > b1 ){
            alice.add(1);
        }else if (a1==b1){

        }
        else{
            bob.add(1);
        }

        if (a2 > b2){
            alice.add(1);
        }else if (a2==b2){

        }
        else{
            bob.add(1);
        }

//        if (alice.size() != 0) {
//            for (Integer al : alice) {
//                System.out.print(al + " ");
//            }
//        }else{
//            System.out.print("0 ");
//        }
//        if (bob.size() != 0) {
//            for (Integer b : bob) {
//                System.out.print(b + " ");
//            }
//        }else{
//            System.out.print("0");
//        }

        System.out.print(alice.size() + " " + bob.size());

    }

}
