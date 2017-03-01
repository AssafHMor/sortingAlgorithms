import java.util.Arrays;

/**
 * Created by AM on 23/02/2017.
 */
public class SortingAlgorithms {
    /**
     * INSERTION SORT: sorting an array of integers from smaller to larger
     * @param arr to sort
     * @return sorted array
     */
    public static int[] insertionSort (int arr[]){

        if (arr.length == 1)
            return arr;

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



    public static int[] bubbleSort (int arr[]){
        if(arr.length == 1)
            return arr;
        int lenArr = arr.length;
        while (lenArr != 0) {
            int altLenArr = 0;
            for (int i = 1; i < lenArr; i++) {
                if (arr[i-1] > arr[i]){
                    int temp1 = arr[i];
                    int temp2 = arr[i-1];
                    arr[i-1] = temp1;
                    arr[i] = temp2;
                    altLenArr = i;
                }
            }
            lenArr = altLenArr;
        }
        return arr;
    }

    public static int[] mergeSort (int arr[]){

        if (arr.length == 1)
            return arr;

        int middle = (int)Math.floor(arr.length/2);
        //new "left" array half size of original array
        int [] leftArr = new int [middle];
        //new "right" array complementary size of "left" array
        int [] rightArr = new int [arr.length-middle];

        for (int i=0;i<arr.length;i++){
            if (i < middle)
                leftArr[i] = arr[i];
            else
                rightArr[i - middle] = arr[i];
        }
        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);
        return arr;

    }


    public static void main(String[]args){
        int [] a = {5,345,54,2345,2,35,3,5,34,2345,345,4,24,56,68,85,7234,1,4656,7,8,765,3,45,345,};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}

