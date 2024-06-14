class ArmstrongNumbers {
    public static String armstrongNumber(int n) {
        // code here

        int sum = 0;
        int temp = n;

        while(n != 0) {
            int remainder = n % 10;
            sum += (int)Math.pow(remainder, 3);
            n /= 10;
        }
        if(sum == temp) {
            return "true";
        }
        else {

            return "false";
        }
    }
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
}