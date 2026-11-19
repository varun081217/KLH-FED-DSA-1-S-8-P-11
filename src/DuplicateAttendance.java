import java.util.*;
public class DuplicateAttendance {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        int[] rolls = new int[n];
        
        for (int i = 0; i < rolls.length; i++) {
            System.out.println("Enter roll number " + (i + 1) + ": ");
            rolls[i] = sc.nextInt();
        }

        HashMap<Integer, Integer>  frequency = new HashMap<>();

        int distinct = 0;
        int repeats = 0;
        int firstRepeat = -1;

        for (int i = 0; i < rolls.length; i++) {
            int roll = rolls[i];

            int count = frequency.getOrDefault(roll, 0) + 1;
            frequency.put(roll, count);

            if (count == 1) {
                distinct++;
            } else if (count == 2) {
                repeats++;

                if (firstRepeat == -1) {
                    firstRepeat = roll;
                }
            }
        }

        System.out.println("\n===== ATTENDANCE REPORT =====");
        System.out.println("Distinct roll numbers: " + distinct);
        System.out.println("Repeated roll numbers: " + repeats);
        System.out.println("First repeated roll number: " + firstRepeat);

        sc.close();


    }
}