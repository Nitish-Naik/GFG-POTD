public class PalindromeRecursion {
    public static String palindrome(String s)
    {
        if(s.length() <= 1)
        {
            return s;
        }
        return s.substring(s.length()-1) + palindrome(s.substring(0, s.length()-1));
    }

    public static boolean rec(String s, int i, int j) {
        if(j <= i || s == "")
        {
            return true;
        }
        if(s.charAt(i) != s.charAt(j)) {
             return false;
        }
        return rec(s, i+1, j-1);
    }
    public static void main(String[] args) {
        String s = "abbac";
        // String revs = palindrome("abba");
        // if(s.equals(revs))
        // {
        //     System.out.println(true);
        // }
        // else {
        //     System.out.println(false);
        // }
        System.out.println(rec(s, 0, s.length()-1));
    }
}
