import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedicineSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> medicines = new ArrayList<>();
        
       
        for (int i = 0; i < 3; i++) {
            
            String medicine = scanner.nextLine();
            medicines.add(medicine);
        }
        
      
        Collections.sort(medicines, (m1, m2) -> m1.compareToIgnoreCase(m2));
        
        
     
        for (String medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
