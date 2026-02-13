public class Arrays{
    public static void changeArr(int arr[], int i, int val) {
        // base class 
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1); //fn call step
        arr[i] = arr[i] -22;  //bkt step
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + 25 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[8]; 
        // printArr(arr);
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}