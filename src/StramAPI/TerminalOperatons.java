package StramAPI;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperatons {
    static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3);
        Stream<Integer> streamOperation = integers.stream();
        System.out.println( "Количество элементов: " + streamOperation.count());

        Stream<Integer> streamOperation2 = integers.stream();
        System.out.println("Печататем на экран элементы:");
        streamOperation2.forEach(e-> System.out.println(e));
    }
}
