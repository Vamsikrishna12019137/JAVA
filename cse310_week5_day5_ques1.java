import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String... vamsi) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=7){
            int marks[] = new int[n];
            for(int i=0;i<n;i++){
                marks[i]=sc.nextInt();
            }
            int total =0;
            for(int i=0;i<n;i++){
                total = total+marks[i];
            }
            int percent = (total*100)/(n*100);
            if(percent>90){
                System.out.print("A+");
            }
            else if(percent>=70 && percent<=89){
                System.out.print("A");
            }
            else if(percent>=60 && percent<=69){
                System.out.print("B");
            }
            else if(percent>=50 && percent<=59){
                System.out.print("C");
            }
            else {
                System.out.print("D");
            }
        }
        else{
            System.out.print("Invalid");
        }
    }
}
