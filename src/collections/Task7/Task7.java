package collections.Task7;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for(int  i = 0; i< arr.length; i++){
            arr[i] = (int) (Math.random()*(600+1)) - 100000;
        }
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        quickSort(arr);
       // mergeSort(arr);

    }
    //Bubble sort
    //Принцип: сравнивает следующий элемент и меняет местами, если выполняется условие.
    //O(n^2)
    public static void bubbleSort(int[] arr){
        long start,stop;
        start = System.nanoTime();
        int first;
        boolean check = true;
        while (check){
            check = false;
            for(int i =0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    check = true;
                    first = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = first;
                }
            }
        }
        stop = System.nanoTime();

        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("time:"+(stop-start));
    }
    //Selection sort
    //Принцип - находиться самый маленький элемент массива, меняется местами с первым элементом. Так повторяется (инкрементируя элемент с которым меняется местами) до полной сортировки массива
   //O(n^2)
    public static void selectionSort(int[] arr){
        long start,stop;
        start = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println("\n");
        }
        stop = System.nanoTime();
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("time:"+(stop-start));
    }
    //Insertion sort
    //Принцип - берется второй элемент(предпологая, что первый уже отсортирован) и вставляется в нужное место в уже отсортированной части массива, повторяется, пока весь массив не будет остортирован
    //O(n^2)
    public static void insertionSort(int[] arr){
        long start,stop;
        start = System.nanoTime();
        for (int i = 1; i < arr.length; i++) {

            for(int x:arr){
                System.out.print(x+" ");
            }
            int first = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > first) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = first;

            System.out.println("\n");
        }
        stop = System.nanoTime();

        System.out.println("time:"+(stop-start));
    }
    //Quick sort
    //Принцип -  берется опорный элемент, дальше массив разбивается на 2 части больше опорного и меньше, каждая часть отсортировываеться рекурсивно
    // O(n log n)
    public static void quickSort(int[] arr) {
        long start,stop;
        start = System.nanoTime();
        quickSortRecursive(arr, 0, arr.length - 1);
        stop = System.nanoTime();
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("time: " + (stop - start));
    }
    // Рекурсивно(создавая подмассивы) сортирует две части
    private static void quickSortRecursive(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSortRecursive(arr, left, pivotIndex - 1);
            quickSortRecursive(arr, pivotIndex + 1, right);
        }

    }
    //Разбивает массив на 2 части и обменивается элементами
    private static int partition(int[] arr, int left, int right) {
        int pivotValue = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivotValue) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;

    }
    //Merge sort
    //Принцип - массив делится на 2 части, каждая часть рекурсивно сортируеться(принцип - сортируються  два элемента, после чего проиходит слияние этих элментов, потом сортируються пары уже отсортированых элементов, происходит слияние и тд пока подмассив не будет отсортирован)
   // O(n log n)/O(n^2)
    public static void mergeSort(int[] arr) {
        long start,stop;
        start = System.nanoTime();
        mergeSortRecurs(arr, 0, arr.length - 1);
        stop = System.nanoTime();

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("time:"+(stop-start));
    }
    //Слияние двух отсортированных частей
    private static void merge(int[] arr, int left, int mid, int right) {
        int length1 = mid - left + 1;
        int length2 = right - mid;

        int[] lArr = new int[length1];
        int[] rArr = new int[length2];
        for (int i = 0; i < length1; ++i) {
            lArr[i] = arr[left + i];
        }
        for (int j = 0; j < length2; ++j){
            rArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < length1 && j < length2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < length1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < length2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    // Рекурсивная сортировка
    private static void mergeSortRecurs(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortRecurs(arr, left, mid);
            mergeSortRecurs(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }





}
