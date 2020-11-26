package Lab_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class CompareStrings {
    private static void showStr(String text, List<String> strings) {
        System.out.println("\n=========== " + text + " ============");
        strings.forEach(s -> System.out.println(s));
    }



    private static void showStr(String text, String value) {
        System.out.println("\n=========== " + text + " ============");
        System.out.println(value);
    }



    public static void main(String[] args) {



        List<String> strings = new ArrayList();
        strings.add("eve1");
        strings.add("carol1");
        strings.add("alice1");
        strings.add("bob1");
        strings.add("dave1");



        showStr("strings", strings);

        List<String> strings2 = strings
                .stream()
                .filter(text -> text.contains("e"))
                .filter(text -> text.contains("a"))

                .collect(Collectors.toList());

        List<String> strings3 = strings
                .stream()
                .map(s -> s.length())
                .map(i->"The lenght is : " + i)
                .distinct()
                .skip(1)
                .filter(s->s.contains("6"))
                .collect(Collectors.toList());

        strings3.forEach(System.out::println);

        //showStr("strings2" , strings2);
        //showStr("strings3" , strings3);

               String item = strings
                       .stream()
                .filter(s -> !s.contains("a"))
                .findFirst()
                .orElseThrow(()->(new RuntimeException("Could not found it")));

        Optional<String> item2 = strings
                .stream()
                .filter(s -> !s.contains("a"))
                .findFirst();

        String realItem = item2.isPresent() ? item2.get() : " not found ";

    }
}
