import java.util.ArrayList;

public class JugglerSequence {
    public static ArrayList<Long> juggler(long n) {
        ArrayList<Long> sequence = new ArrayList<>();
        long currentTerm = n;
        sequence.add(currentTerm);

        while (currentTerm != 1) {
            if (currentTerm % 2 == 0) {
                currentTerm = (long) Math.floor(Math.sqrt(currentTerm));
            } else {
                currentTerm = (long) Math.floor(Math.pow(currentTerm, 1.5));
            }
            sequence.add(currentTerm);
        }

        return sequence;
    }
    public static void main(String[] args) {
        System.out.println(juggler(9));
    }
}
