import java.util.Scanner;

public class TestEvaluation {
public static void main(String... vamsi) {
    Scanner scanner = new Scanner(System.in);

    String correctAnswers = scanner.nextLine().toUpperCase();

    int numStudents = scanner.nextInt();
    scanner.nextLine();

  for (int i = 0; i < numStudents; i++) {
        String studentAnswers = scanner.nextLine().toUpperCase();
        double studentMarks = calculateMarks(correctAnswers, studentAnswers);
        System.out.print(studentMarks + " ");
    }
}

public static double calculateMarks(String correctAnswers, String studentAnswers) {
    if (correctAnswers.length() != studentAnswers.length()) {
        throw new IllegalArgumentException("Incorrect Input");
    }

    double marks = 0;
    for (int i = 0; i < correctAnswers.length(); i++) {
        char correctAnswer = correctAnswers.charAt(i);
        char studentAnswer = studentAnswers.charAt(i);

        if (studentAnswer == 'X') {
            continue;
        }

        if (studentAnswer == correctAnswer) {
            marks += 1;
        } else {
            marks -= 0.25;
        }
    }

    return marks;
}
}
