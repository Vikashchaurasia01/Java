// Write a program to compare two strings using ==, compareTo() and equals() method.

class Compare {
    public static void main(String[] args) {

        String s1 = "except";
        String s2 = new String("expect");
        if (s1 == s2)
            System.out.println("Both strings are same");
        else
            System.out.println("Both strings are not same");
        if (s1.equals(s2))
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");

        int c = s1.compareTo(s2);

        if (c > 0)
            System.out.println(s1 + " is greater");
        else if (c < 0)
            System.out.println(s2 + " is greater");
        else
            System.out.println("Both strings are equal");
    }
}