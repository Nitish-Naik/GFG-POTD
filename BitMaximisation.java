import java.util.*;
class BitMaximisation {
    public static int getMax(int x) {
        // Get the binary representation of x
        String binary = Integer.toBinaryString(x);
        int length = binary.length();
        
        // Convert binary string to a mutable character array
        char[] binaryArray = binary.toCharArray();
        
        // Collect all positions of unset bits
        List<Integer> unsetBitPositions = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (binaryArray[i] == '0') {
                unsetBitPositions.add(i);
            }
        }

        int max = x; // Initialize with the original number

        // Try setting up to two unset bits
        for (int i = 0; i < unsetBitPositions.size(); i++) {
            int pos1 = unsetBitPositions.get(i);
            // Set the first bit and calculate the new number
            binaryArray[pos1] = '1';
            int newNumber1 = Integer.parseInt(new String(binaryArray), 2);
            max = Math.max(max, newNumber1);

            for (int j = i + 1; j < unsetBitPositions.size(); j++) {
                int pos2 = unsetBitPositions.get(j);
                
                // Make sure that the second bit is not adjacent to the first bit
                if (Math.abs(pos1 - pos2) > 1) {
                    // Set the second bit and calculate the new number
                    char[] newBinaryArray = binaryArray.clone();
                    newBinaryArray[pos2] = '1';
                    int newNumber2 = Integer.parseInt(new String(newBinaryArray), 2);
                    max = Math.max(max, newNumber2);
                }
            }
            
            // Reset the first bit to '0'
            binaryArray[pos1] = '0';
        }

        return max;
    }

    public static void main(String[] args) {
        int x = 19; // Example input
        System.out.println(getMax(x)); // Expected output with maximum value after setting at most two unset bits
    }
}
