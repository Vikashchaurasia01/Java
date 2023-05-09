// Write a program to convert character array to string object and vice versa.

public class Exchange {
    public static void main(String[] args) {
        char[] arr = { 'H', 'E', 'L', 'L', 'O' };
        String str = String.valueOf(arr);
        System.out.println(str);

        String s = "World";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i] + " ");
    }
}
