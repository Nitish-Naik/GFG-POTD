import java.util.*;
import java.io.*;
public class DecodeTheString {
    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k=0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                 // Build the number k
                k = k * 10 + (c-'0');
                System.out.println("k : "+ k);
            }
            else if(c == '[') {
                // Push the count and the current string onto their respective stacks
                countStack.push(k);
                stringStack.push(currentString);
                // Reset for the new substring inside brackets
                currentString = new StringBuilder();
                k = 0;
            }
            else if (c == ']') {
                // Pop the previous count
                int repeatTimes = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                 // Repeat the string 'repeatTimes' times and append it to the previous string
                while (repeatTimes-- > 0) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // Regular character, append to current string
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("output.txt");

        try (
            Scanner ip = new Scanner(new File("input.txt"));
            PrintWriter op = new PrintWriter(f);
        ) {
            int testCases = ip.nextInt();
            ip.nextLine();
            op.println("testcases : "+ testCases);
            for(int t=1; t<=testCases; t++) {
                String s = ip.nextLine();
                op.println("s : " + s);
                op.println("Test Case " + t + ":");
                op.println("Input: " + s);
                String res = decodeString(s);
                
                op.println("Output : " + res);
                op.println();
                System.out.println("The Result of " + t + " is written to output.txt");
            }
        }
    }
}