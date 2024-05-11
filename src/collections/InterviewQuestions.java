package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);

		for (int eachNum : list1) {
			if (eachNum % 2 == 1)
				System.out.println(eachNum);
		}

//		Predicate<Integer> predicate = (t) -> t%2==1;
//		list1.stream().filter(predicate).forEach(eachNum->System.out.println(eachNum));

//		list1.stream().filter(eachVal->eachVal%2==0).forEach(eachNum->System.out.println(eachNum));

		list1.stream().filter(eachVal -> eachVal % 2 == 0).forEach(eachNum -> System.out.println(eachNum));

		List<Integer> evenList = list1.stream().filter(eachVal -> eachVal % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		List<Integer> mapList = list1.stream().map(eachVal -> eachVal * 5).collect(Collectors.toList());

		System.out.println(mapList);

		int sum = list1.stream().reduce(0, (val1, val2) -> val1 + val2);

		System.out.println(sum);

		String str = "HelloThisisjava";
		String str2 = "Apple Banana Apple Grape Banana Apple";
		String[] fruits = { "Apple", "Banana", "Apple", "Grape", "Banana", "Apple" };

		Map<Character, Integer> map1 = new HashMap<>();

		for (char eachChar : str.toCharArray()) {
			if (!map1.containsKey(eachChar))
				map1.put(eachChar, 1);
			else
				map1.put(eachChar, map1.get(eachChar) + 1);
		}

		System.out.println(map1);

		Map<String, Integer> map2 = new HashMap<>();

		for (String eachWord : str2.split(" ")) {
			if (!map2.containsKey(eachWord))
				map2.put(eachWord, 1);
			else
				map2.put(eachWord, map2.get(eachWord) + 1);
		}

		System.out.println(map2);

		List<String> fruitsList = Arrays.asList("Apple", "Banana", "Apple", "Grape", "Banana", "Apple",  "Grape",  "Grape",  "Grape");
		Map<String, Long> fuitsMap = fruitsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(fuitsMap);

		Map<Character, Long> charsMap = str.chars().mapToObj(eachChar -> (char) eachChar)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(charsMap);

		List<Character> list = str.chars().mapToObj(eachChar->(char)eachChar).filter(eachChar -> "aeiou".contains(String.valueOf(eachChar)))
				.collect(Collectors.toList());
		Collections.reverse(list);
		Collections.sort(list,Collections.reverseOrder());
//		Collections.reverseOrder();
		System.out.println(list);
		
		System.out.println("----------------------------------------------");
		
		System.out.println(fuitsMap);
		
		
		TreeMap map = new TreeMap(Collections.reverseOrder());
		map.putAll(fuitsMap);
		
		System.out.println(map);
		
		Comparator<Map.Entry<String,Long>> compt = (o1, o2)-> {
			if(o1.getValue() > o2.getValue())
				return o1.getValue().compareTo(o2.getValue());
			else
				return o1.getValue().compareTo(o2.getValue());
				
		};
		
		List<Map.Entry<String,Long>> comp =  new ArrayList<>(fuitsMap.entrySet());
		
		Collections.sort(comp,compt);
		
		Map<String,Long> newMap = new LinkedHashMap<>();
		
		for(Map.Entry<String,Long> eachEntry:comp) {
			newMap.put(eachEntry.getKey(), eachEntry.getValue());
		}
		
		System.out.println(newMap);
	}
}
