package Algirithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSorted {
    static void main(String[] args) {

        //Arrays
        int[] array = {5,3,2,1,6};
        System.out.println("Массив до сортировки: " + array);
        BubbleSortedToArrays(array);

        //List
        List<Integer> list = new ArrayList<>(List.of(1,3,6,0,-11));
        System.out.println("Лист до сортирвки: " + list);
        BubbleSortedToList(list);
    }
   static void BubbleSortedToArrays(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] < array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }

        }
       System.out.println("Массив после сортирвоки: " + Arrays.toString(array));
    }
    static void BubbleSortedToList (List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
            System.out.println("Лист после сортировки: " + list);

    }
}


