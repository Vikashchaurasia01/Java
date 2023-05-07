class KeyStatic{

    private static int x = 59; //if we don't use static here then value will not printed
    private static int y = 95; //Error if static keyword is not used here
    
    static{
        System.out.println("Before this keyword x = "+x + " y = "+y);
    }
    public static void main(String[] args) {
        System.out.println("Hello from main");
    }
}