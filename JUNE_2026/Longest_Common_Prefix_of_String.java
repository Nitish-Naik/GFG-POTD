package JUNE_2026;
class Longest_Common_Prefix_of_String {
    public static String longestCommonPrefix(String arr[]) {
        if (arr.length == 0) return "-1";
        String prefix = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "-1";
            }
        }
        return prefix.isEmpty() ? "-1" : prefix;
    }
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr));
    }
}