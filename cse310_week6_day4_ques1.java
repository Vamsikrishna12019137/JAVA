import java.util.Arrays;

public class AverageMarks {
    public static double[] average_marks(double[][] marks) {
        int n = marks.length; // number of students
        double[] averages = new double[n];

        for (int i = 0; i < n; i++) {
            // sort the marks of the student in descending order
            Arrays.sort(marks[i], 0, 3);
            double sum = marks[i][1] + marks[i][2]; // add the best 2 marks
            averages[i] = sum / 2; // compute the average of best 2 marks
        }

        return averages;
    }

    public static void main(String[] args) {
        // sample input
        double[][] marks = {
            {10.5, 2.5, 15},
            {5.25, 6.75, 11.25}
        };

        // call the method to compute the average marks of best 2 academic tasks
        double[] averages = average_marks(marks);

        // print the result
        for (double avg : averages) {
            System.out.print(avg + " ");
        }
    }
}
