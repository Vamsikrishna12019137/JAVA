import java.util.Arrays;

public class CommonElements {
    public static void main(String... vamsi) {
        int[] arr1 = {3, 7, 8, 6, 5};
        int[] arr2 = {4, 3, 8, 6};
        int[] arr3 = {3, 7, 8, 5, 6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++; j++; k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }
}
