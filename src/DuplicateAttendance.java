import java.util.*;

public class DuplicateAttendance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        int[] rolls = new int[n];

        for (int i = 0; i < rolls.length; i++) {
            System.out.println("Enter roll number " + (i + 1) + ": ");
            rolls[i] = sc.nextInt();
        }

        int distinct = 0;
        int repeats = 0;
        int firstRepeat = -1;

        for (int i = 0; i < rolls.length; i++) {
            int currentRoll = rolls[i];

            // Count how many times currentRoll appears in the array
            int count = 0;
            for (int j = 0; j < rolls.length; j++) {
                if (rolls[j] == currentRoll) {
                    count++;
                }
            }

            // Check if this is the first time we are seeing currentRoll
            boolean seenBefore = false;
            for (int k = 0; k < i; k++) {
                if (rolls[k] == currentRoll) {
                    seenBefore = true;
                    break;
                }
            }

            if (!seenBefore) {
                distinct++;
                if (count > 1) {
                    repeats++;
                }
            }

            // Check if this roll number appeared earlier in the array
            boolean appearedEarlier = false;
            for (int k = 0; k < i; k++) {
                if (rolls[k] == currentRoll) {
                    appearedEarlier = true;
                    break;
                }
            }

            if (appearedEarlier && firstRepeat == -1) {
                firstRepeat = currentRoll;
            }
        }

        System.out.println("\n===== ATTENDANCE REPORT =====");
        System.out.println("Distinct roll numbers: " + distinct);
        System.out.println("Repeated roll numbers: " + repeats);
        System.out.println("First repeated roll number: " + firstRepeat);

        sc.close();
    }
}