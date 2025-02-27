package Algorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n= arr.length;
        boolean swappeed;

        for(int i=0; i<n-1; i++){
            swappeed = false;

            for(int j=0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swappeed = true;
                }
            }
            if(!swappeed) break;
        }
    }
    public static void printArray(int[] arr){
        for(var element: arr){
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2};
        System.out.println("Array original");
        printArray(arr);

        bubbleSort(arr);
        System.out.println();
        System.out.println("Array after bubble sort");
        printArray(arr);

    }
}
