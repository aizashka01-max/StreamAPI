package StramAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    static void main(String[] args) {
        List<Integer> integers = List.of(3,2,1);
        for (int i = 0; i <integers.size() ; i++) {
            if(integers.get(i) ==3 )
            {
                System.out.println("число " + integers.get(i) + " под номером " + i);
            }
        }

            IntStream.range(0, integers.size())
                    .filter(i -> integers.get(i) == 3)
                    .forEach(i->System.out.println("Число "
                            + integers.get(i) +
                            " стоит под номером " + i));
    }
}
