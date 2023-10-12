import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char numeral = s.charAt(i);
            int curValue = romanNumerals.get(numeral);
            if (curValue < prevValue) {
                total -= curValue;
            } else {
                total += curValue;
            }
            prevValue = curValue;
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Example Roman numeral
        int integerValue = romanToInt(romanNumeral);
        System.out.println("Integer value: " + integerValue);
    }
}
