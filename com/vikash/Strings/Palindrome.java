// Write a program to to check given string is palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int len = str.length();
        for (i = 0; i < len / 2; i++)
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        return true;
    }
}
