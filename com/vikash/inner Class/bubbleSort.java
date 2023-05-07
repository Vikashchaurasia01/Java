class bubble{
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

public class bubbleSort {

    public static void printArray(int a[]){
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 0, 3, 2, 1};
        System.out.println("Before Sorting: ");
        printArray(arr);
        bubble b = new bubble();
        
        
        b.bubbleSort(arr);
        System.out.println("\nAfter Sorting: ");
        printArray(arr);
    }
}
