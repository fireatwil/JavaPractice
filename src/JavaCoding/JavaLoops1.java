package JavaCoding;

import java.util.Scanner;

/**
 * Created by pambast on 7/31/17.
 * Objective
 In this challenge, we're going to use loops to help us do some simple math.

 Task
 Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

 Input Format

 A single integer, N.

 Constraints: 2 <= N <= 20

 Output Format

 Print 10 lines of output; each line i (where 1 <= i <= 10) contains the  of  in the form:
 N x i = result.

 Sample Input
 2

 Sample Output
 2 x 1 = 2
 2 x 2 = 4
 2 x 3 = 6
 2 x 4 = 8
 2 x 5 = 10
 2 x 6 = 12
 2 x 7 = 14
 2 x 8 = 16
 2 x 9 = 18
 2 x 10 = 20

 */
public class JavaLoops1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 1; j <= 10; j++){
            System.out.println(i + " x " + j + " = " + i*j);
        }

    }

}
