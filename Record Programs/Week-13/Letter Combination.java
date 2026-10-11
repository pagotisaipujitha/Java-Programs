
import java.util.*;

public class LetterCombinations {

    static String[] phone = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static List<String> result = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        result.clear();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        generate(digits, 0, "");

        return result;
    }

    static void generate(String digits, int index, String current) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';

        for (int i = 0; i < phone[digit].length(); i++) {
            char ch = phone[digit].charAt(i);
            generate(digits, index + 1, current + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine();

        System.out.println(letterCombinations(digits));

        sc.close();
    }
}
