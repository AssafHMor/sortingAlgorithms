import java.util.Arrays;

/**
 * Created by AM on 23/02/2017.
 */
public class SortingAlgorithms {
    /**
     * sorting an array of integers from smaller to larger
     * @param arr to sort
     * @return sorted array
     */
    public int[] insertionSort (int arr[]){

        if (arr.length == 1){
            return arr;
        }

        for (int i =1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }



    public int[] mergeSort (int arr[], int q, int p, int r){

        if (arr.length == 1){
            return arr;
        }

        int n1 = q-p+1;
        int n2 = r-q;
        int leftArr [] = Arrays.copyOfRange(arr, 0, n1);
        int rightArr [] = Arrays.copyOfRange(arr, n1+1, arr.length );


    }
}

