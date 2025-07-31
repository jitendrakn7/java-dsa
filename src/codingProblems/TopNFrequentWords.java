package codingProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopNFrequentWords {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Java stream API", "Stream API is powerful", "Java is great");
        Map<String, Long> wordCount = sentences.stream().flatMap(s-> Arrays.stream(s.toLowerCase().split("\\W+"))).collect(Collectors.groupingBy(w->w,Collectors.counting()));
        List<String> result = wordCount.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).map(Map.Entry::getKey).toList();
        System.out.println(result);
    }
}
