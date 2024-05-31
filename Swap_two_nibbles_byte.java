public class Swap_two_nibbles_byte {
    static int swapNibbles(int n) {
        String bin = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
        
        // Swap the nibbles
        String swap = bin.substring(4) + bin.substring(0, 4);
        int result = Integer.parseInt(swap, 2);
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(swapNibbles(19)); 
    }
}
