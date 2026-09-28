package String;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringOperation {
    static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = " ";
        String str4 = "Hello world";
        String str5 = "hello";

        //Проверка на пустоту строки
        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());

        System.out.println();

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());

        System.out.println();
        //соединение строк
        System.out.println(str1 + str3 + str2);
        System.out.println(str2.concat(str1));
        System.out.println(String.join(str3, str1, str2));

        System.out.println();
        //Извлечение символов из подстрок
        System.out.println(str4.charAt(3));
        int num1 = 6;
        int num2 = 11;
        char[] world = new char[num2 - num1];
        str4.getChars(num1, num2, world, 0);
        System.out.println(world);

        System.out.println();
        //Сравнение строк
        System.out.println(str1.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str4));
        //В данном случае метод сравнивает 4 символа с 1-го индекса первой строки ("Hello") и
        // 1 символа со 1-го индекса второй строки ("wor"). Так как эти подстроки одинаковы,
        // то возвращается true.
        boolean result = str1.regionMatches(1,str4,1,4 );
        System.out.println(result);

        // String -> string arr
        String string = "apple    cucumber  tomat";
        System.out.println(string);
        String[] arr = string.split(",");
        // Разделяем по запятой и любому количеству пробелов вокруг неё
        String[] arr1 = string.split("\\s+");

        //String -> string list
        List<String> list = new ArrayList<String>(List.of(string.split("\\s+")));
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));


    }
}
