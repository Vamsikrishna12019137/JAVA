import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public boolean check(int n){
        if(n%2==0&&n%3==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String... vamsi) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        Solution a=new Solution();
        if(n<20||n>400){
            System.out.println("Invalid Input");
        }
        else{
            if(a.check(n)){
                System.out.println("True");
                }
            else{
                System.out.println("False");
            }
        }
    }
}
