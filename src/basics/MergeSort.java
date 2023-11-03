package basics;

class MergeSort {
    void mergeSort(int[] arr) {
        mergeSortHelper(arr);
    }

    public static void mergeSortHelper(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, mid, right, 0, right.length);

        mergeSortHelper(left);
        mergeSortHelper(right);

        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftArrayIndex = 0, rightArrayIndex = 0, resultIndex = 0;

        while (leftArrayIndex < left.length && rightArrayIndex < right.length) {
            if (left[leftArrayIndex] <= right[rightArrayIndex])
                arr[resultIndex++] = left[leftArrayIndex++];
            else
                arr[resultIndex++] = right[rightArrayIndex++];
        }

        while (leftArrayIndex < left.length)
            arr[resultIndex++] = left[leftArrayIndex++];
        while (rightArrayIndex < right.length)
            arr[resultIndex++] = right[rightArrayIndex++];
    }
}
