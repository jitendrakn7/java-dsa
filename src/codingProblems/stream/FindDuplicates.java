package codingProblems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        List duplicateNums = nums.stream().collect(Collectors.groupingBy(n-> n,Collectors.counting())).entrySet().stream().filter(v-> v.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(duplicateNums);
    }
}
