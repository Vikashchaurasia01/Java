// Write a program to replace substring with another one.

public class ReplaceSubstring {
    public static void main(String[] args) {

        String s1 = "This is a original string";
        String s2 = s1.replaceAll("is", "at");
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
