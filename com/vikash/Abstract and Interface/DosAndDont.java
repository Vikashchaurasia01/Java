interface test{
    final static int X = 10;
    public abstract void meth1();
    public abstract void meth2();
    private void meth3(){     
        System.out.println("meth3 of test");
    }
    default void meth5(){   // method may be override or not
        meth3();
    }
}

interface test2 extends test{
    void meth4();
}

class my implements test2{
    public void meth1(){System.out.println("meth1");}
    public void meth2(){System.out.println("meth2");}
    public void meth4(){System.out.println("meth4");}
}

public class DosAndDont{
    public static void main(String[] args){
        System.out.println(test.X);

        //test.meth3();  //when and only static keyword is used

        my m = new my();
        m.meth4();
        //m.meth3();
    } 
}