package homework.string;

public class FirstTask {

    public static void main(String[] args) {

        String value1 = "abcba";
        String value2 = "abcbm";

        isPalindrome(value1);
        isPalindrome(value2);
    }

    private static void isPalindrome(String testString){

        StringBuilder newString = new StringBuilder(testString);
        String reverseString = new String(newString.reverse());

        if (testString.equals(reverseString)){
            System.out.println("Строка " + testString + " является палиндромом.");
        } else {
            System.out.println("Строка " + testString + " не является палиндромом.");
        }

    }
}


