public class InsertionSort {
    public static void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] <temp){
                arr[j+1] = arr[j];
                j =j-1;
            }arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] i = {1, 5, 2, 3, 1, 3, 0};
        InsertionSort(i);
        for (int num : i) {
            System.out.print(num + " ");
        }
    }
}