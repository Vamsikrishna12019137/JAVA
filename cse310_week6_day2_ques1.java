import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Integer1{
    int[] array;
    
    public Integer1(int[] array){
        this.array=array;
    }
    
    public int sum(){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }
    public int mul(){
        int mul=1;
        for(int i=0;i<array.length;i++){
            mul=mul*array[i];
        }
        return mul;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n<=0){
            System.out.println("Invalid");
        }
        else{
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=obj.nextInt();
            }
            Integer1 a=new Integer1(array);
            int choice=obj.nextInt();
            if(choice==1){
            System.out.println(a.sum());
            }else if(choice==2){
            System.out.println(a.mul());
            }else{
            System.out.println("Wrong Choice");
        }
    }
} }
