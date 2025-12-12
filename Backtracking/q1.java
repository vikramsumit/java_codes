public class q1 {
    public static void changeArr(int arr[], int i , int val){
        // basecase
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 5;
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[41];
        // int[] arr = {1,2,3,4,5,6,7,8};
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}


