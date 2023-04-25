public class FuncSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        //int swap1;
        System.out.println(a + " " + b);

        String name = "vikash";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {

        name = "kunal";
    }

    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
