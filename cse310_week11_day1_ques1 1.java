import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String... vamsi) {

        Scanner scanner = new Scanner(System.in);

        

        

        int n = scanner.nextInt();

        

        if (n < 2) {

            System.out.println("Invalid");

            return;

        }


        String[] strings = new String[n];

        

        for (int i = 0; i < n; i++) {

            strings[i] = scanner.next();

        }

       

        Arrays.sort(strings);

        

       

        for (String string : strings) {

            System.out.println(string);

        }

    }

}
