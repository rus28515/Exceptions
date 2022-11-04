package org.itstep.task04;

import java.util.Arrays;

public class Main {
    public static int binarySearch(int[] arr, int key) throws ArrayNotSortedException {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                throw new ArrayNotSortedException();
            }
        }
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
    }
}

class ArrayNotSortedException extends Exception {

}
