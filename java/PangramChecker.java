// 3. Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String inputString) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : inputString.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();

        if (isPangram(inputString)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}
