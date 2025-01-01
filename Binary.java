public class Binary {
    public static void binToDec(int binNum) {
        int originalNum = binNum;
        int pow = 0;
        int num = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            num = num + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("The decimal equivalent of the binary number " + originalNum + " is: " + num);
    }

    public static void main(String[] args) {
        binToDec(111);
    }
}
