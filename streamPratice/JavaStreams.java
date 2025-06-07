package streamPratice;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println( nums.stream().filter(item-> item%2==0).collect(Collectors.toList()));
        List<String> names = Arrays.asList("john", "jane", "jack");
        System.out.println(names.stream().map(name->name.toUpperCase()).collect(Collectors.toList()));
        List<String> words = Arrays.asList("apple", "dog", "banana", "cat", "elephant");
        System.out.println(words.stream().filter(item->item.length()>4).collect(Collectors.toList()));
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        System.out.println(numbers.stream().map(item->item*item).collect(Collectors.toList()));
        List<String> strings = Arrays.asList("", "", "hello", "world");
        System.out.println(strings.stream().filter(item->!item.isEmpty()).findFirst());
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(number.stream().filter(item->item%2!=0).mapToInt(Integer::intValue).sum());
        List<Integer> num = Arrays.asList(10, 30, 20, 40, 5);
        System.out.println(num.stream().max(Integer::compareTo).orElse(-1));
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        System.out.println(fruits.stream().collect(Collectors.joining(",")));
        List<String> word = Arrays.asList("a", "ab", "abc", "de", "xyz", "pqrs");
        System.out.println(word.stream().collect(Collectors.groupingBy(String::length)));
        List<String> wording = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(wording.stream().collect(Collectors.groupingBy(wd->wd,Collectors.counting())));
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);
        List<Integer> og = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 3);
        Set<Integer> seen = new HashSet<>();
        System.out.println(og.stream().filter(n->!seen.add(n)).collect(Collectors.toSet()));

    }
}
