package 자료구조_study;

public class QuickSort {
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end){
        int part2 = partition(arr, start, end);

        if(start < part2 - 1){
            quickSort(arr, start, part2 - 1);
        }

        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void printArray(int[] array){
        for(int data : array){
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] item = new int[] { 4, 2, 1, 5, 6, 9 };
        System.out.println("퀵정렬 전 :");
        printArray(item);
        System.out.println("퀵정렬 후 :");
        quickSort(item);
        printArray(item);
    }
}