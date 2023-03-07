import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean check(int n){
        if(n%2==0&n%13==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>10&&n<500){
            if(check(n)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}
