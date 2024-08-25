import java.util.*;
public class PermutationsString {
    public static List<String> find_permutation(String s) {
        List<String> result = new ArrayList<>();
        helper(s, result, new String(""), 0);
        return result;
    }

    public static void helper(String s, List<String> result, String ans, int index) {
        if(index == s.length()) {
            result.add(ans);
            return;
        }

        helper(s.substring(index), result, ans + s.charAt(index), index+1);
        helper(s.substring(index), result, ans, index+1);

    }
    public static void main(String[] args) {
        String a = "ABC";
        System.out.println(find_permutation(a));
    }
}