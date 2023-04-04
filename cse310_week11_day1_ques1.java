import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String... vamsi) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n>1)
        {
            int count = 0;
            int arr[] = new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i] = scan.nextInt();
            }
             for (int i=0;i<n;i++)
            {
                 if (arr[i]>25)
                     count++;
            }
            System.out.println(count);
        }
        else
        {
                        System.out.println("Invalid Input");

        }
    }
}
