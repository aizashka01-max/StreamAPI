package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    static void main(String[] args) {
        //Массив
        int[] array = {1,5,0,-100,5,3};
        System.out.println("Начальный массив: " + Arrays.toString(array));
        InsertionSortToArray(array);
        //Лист
        System.out.println();
        List<Integer> list = new ArrayList<>(List.of(1,2,4,-90,-5,4));
        System.out.println("Начальный лист: " + list);
        InsertionSortToList(list);

    }
    public  static void InsertionSortToArray(int[] array){
        int j;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for (j = i;j>0 && temp < array[j-1] ; j--) {
               array[j] = array[j-1];
            }
            array[j] = temp;
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(array));
    }

    public  static void InsertionSortToList (List<Integer> list)
    {
        int j;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            for ( j = i; j>0 &&  temp < list.get(j-1); j--) {
                list.set(j, list.get(j-1));
            }
            list.set(j,temp);
        }
        System.out.println("Отсортированный лист: "+list);
    }
}
