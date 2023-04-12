import java.util.*;

    @FunctionalInterface

interface Validator {

  boolean valid(String str, int n);

}

public class Main {

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

    String str = scan.nextLine();

    int n = scan.nextInt();

    Validator validator = (s, i) -> s.length() > i;

    if (n < 1) {

      System.out.println("Invalid input");

    } else if (validator.valid(str, n)) {

      System.out.println("Valid string");

    } else {

      System.out.println("Invalid string");

    }

  }

}
