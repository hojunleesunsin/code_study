package 자료구조_study;

public class SelectionSort {
 
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {            
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }
    
    public static void swap(int[] array, int source, int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }
    
    public static void printArray(int[] array) {
        for(int data: array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int[] item = new int[] { 4, 1, 5, 8, 9, 7 };
        System.out.print("선택정렬  전   : ");
        printArray(item);
        System.out.print("선택정렬  후   : ");
        selectionSort(item);
        printArray(item);
    }
}
