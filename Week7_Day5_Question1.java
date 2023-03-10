import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();

        // create an array to store the frequency of each character
        int[] freq = new int[128];

        // iterate through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                freq[ch]++;
            } else {
                System.out.println("Error");
                return;
            }
        }

        // find the character with maximum frequency
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        // output the result
        System.out.println("Maximum occurring character is: " + maxChar);
    }
}
