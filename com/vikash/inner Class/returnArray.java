//import Lab7.demo;

class demo{
    public void returnArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class returnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        demo d = new demo();
        d.returnArray(arr);
        //System.out.println(arr2[0]);
    }
}
