public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        while (number!=0){
            lastDigit = number%10;
            reverse = (reverse * 10) + lastDigit;
            number = number/10;
        }
        if(originalNumber == reverse){
            return true;
        } else {
            return false;
        }

    }

}
