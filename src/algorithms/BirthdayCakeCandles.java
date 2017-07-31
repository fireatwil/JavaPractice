package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pambast on 7/31/17.
 *
 * Colleen is turning  years old! Therefore, she has  candles of various heights on her cake,
 * and candle i has heighti . Because the taller candles tower over the shorter ones,
 * Colleen can only blow out the tallest candles.

 Given the  for each individual candle, find and print the number of candles she can successfully blow out.

 Input Format

 The first line contains a single integer, , denoting the number of candles on the cake.
 The second line contains  space-separated integers, where each integer  describes the height of candle .

 Constraints
 1 <= n <= pow(10,5)
 1 <= heighti <= pow(10,7)

 Output Format

 Print the number of candles Colleen blows out on a new line.

 Sample Input 0

 4
 3 2 1 3
 Sample Output 0

 2
 Explanation 0

 We have one candle of height , one candle of height , and two candles of height .
 Colleen only blows out the tallest candles, meaning the candles where .
 Because there are  such candles, we print  on a new line.
 */
public class BirthdayCakeCandles {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }

        Collections.sort(list);
        int count = 1;
        for(int i=0; i<(list.size()-1);i++){
            if(list.get(list.size()-1)==list.get(i)){
                count++;
            }
        }

        System.out.print(count);


    }

}
