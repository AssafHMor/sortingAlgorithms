import java.util.Arrays;

/**
 * Created by AM on 23/02/2017.
 */
class SortingAlgorithms {


    /**
     * INSERTION SORT
     * @param arr array to sort
     * @return sorted array
     */
    int[] insertionSort (int arr[]){

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


    /**
     * BUBBLE SORT
     * @param arr array to sort
     * @return sorted array
     */
    int[] bubbleSort (int arr[]){
        if(arr.length == 1)
            return arr;
        int lenArr = arr.length;
        while (lenArr != 0) {
            int altLenArr = 0;
            for (int i = 1; i < lenArr; i++) {
                if (arr[i-1] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    altLenArr = i;
                }
            }
            lenArr = altLenArr;
        }
        return arr;
    }


    int [] quickSort (int arr[], int first, int last){
        if (first < last){
            int pivot = pivot(arr,first,last);
            quickSort(arr,first,pivot-1);
            quickSort(arr,pivot+1,last);
        }
        return arr;
    }

    int pivot(int arr[], int last, int first){

        int pivot = arr[last];
        int i = first -1;
        for (int j = first;j <= last; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;
        return i+1;
    }

    int[] mergeSort (int arr[]){

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
        SortingAlgorithms sa = new SortingAlgorithms();
        int [] a = {5,345,54,2345,2,35,3,5,34,2345,345,4,24,56,68,85,7234,1,4656,7,8,765,3,45,345,};
        System.out.println(Arrays.toString(sa.quickSort(a,0,a.length-1)));
    }
}

