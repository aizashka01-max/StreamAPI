package StramAPI;

//Stream можно создать из:
//1. Массива
//2.Коллекции
//3. Из перечня элементов
//4. Stream.generate

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {


        //массивы
        int[] numbers = {1,2,3};
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(e-> System.out.print(e));
        System.out.println();


        //создание из коллекции
        List<Integer> list = List.of(1,2,3);
        Stream<Integer>listStream = list.stream();
        listStream.forEach(e -> System.out.print(e));
        System.out.println();


        //создание из элементов
        Stream<Integer> elementsStream = Stream.of(1,2,3);
        elementsStream.forEach(e-> System.out.print(e));
        System.out.println();

        Stream.generate(()->1).limit(3).forEach(e-> System.out.print(e));
    }
}
