
public class OddEvenProblem {
    public static String evenOrOdd(String s) {
        int x = 0, y = 0;
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (count[i] % 2 == 0 && (i + 1) % 2 == 0) {
                    x++;
                } else if (count[i] % 2 == 1 && (i + 1) % 2 == 1) {
                    y++;
                }
            }
        }
        
        int sum = x + y;
        return (sum % 2 == 1) ? "ODD" : "EVEN";
    }

    public static void main(String[] args) {
        String s1 = "abbbcc";
        String s2 = "nobitaa";

        System.out.println(evenOrOdd(s1)); // Output: ODD
        System.out.println(evenOrOdd(s2)); // Output: EVEN
    }
}
