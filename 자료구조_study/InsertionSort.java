package 자료구조_study;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[key] < array[j]) {
                    swap(array, key, j);
                    key = j;
                }
            }
        }
    }
 
    public static void swap(int[] array, int source, int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }
 
    public static void printArray(int[] array) {
        for (int data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        int[] item = new int[] { 3, 2, 1, 7, 9, 4 };
        System.out.println("삽입정렬 전 :");
        printArray(item);
        System.out.println("삽입정렬 후 :");
        insertionSort(item);
        printArray(item);
    }
}


