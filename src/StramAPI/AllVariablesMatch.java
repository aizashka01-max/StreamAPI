package StramAPI;

import java.util.List;
import java.util.stream.Stream;

public class AllVariablesMatch {
    static void main(String[] args) {
        //Создали лист
        List<Integer> integers = List.of(1, 2, 3, 4);
        // Присвоили листу стрим использовали логичекую термальную операцию и так дальше
        // allMatch, anyMatch, noneMatch
         Stream<Integer> streamIntegers = integers.stream();
        System.out.println(streamIntegers.anyMatch(e -> e ==3));// хотя бы один совпадает

        Stream<Integer> streamIntegers1 = integers.stream();
        System.out.println(streamIntegers1.allMatch(e -> e==1)); //все элементы совпадают

        Stream<Integer> streamIntegers2 = integers.stream();
        System.out.println(streamIntegers2.noneMatch(e -> e==5)); //ни один из эл не совпадает

    }

}
