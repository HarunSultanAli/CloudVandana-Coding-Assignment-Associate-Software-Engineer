// 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.HashMap;
import java.util.Scanner;

public class RomanToIntegerConverter {
    public static int romanToInteger(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity.
        
        int integer_value = romanToInteger(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + integer_value);

        scanner.close();
    }
}
