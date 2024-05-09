package interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		
		Function<Integer,String> function1 = new Function<>() {
			@Override
			public String apply(Integer t) {
				
				return "Hello";
			}
		};
		
		System.out.println(function1.apply(100));
		
		Function<Integer,String> function2 = (t)-> { return "Hello this is Java";};
		Function<Integer,String> function3 = (t)-> "Welcome to Java";
		System.out.println(function2.apply(100));
		System.out.println(function3.apply(1000));
		
		
		Predicate<Integer> predicate1 = new Predicate<>() {
			@Override
			public boolean test(Integer t) {				
				return t>100;
			}
		};
		
		System.out.println(predicate1.test(100));
		System.out.println(predicate1.test(101));
		
		Predicate<String> predicate2 = (t) -> {return t.contains("Hello");};
		Predicate<String> predicate3 = (t) -> t.contains("Hello");
		System.out.println(predicate2.test("Hello"));
		System.out.println(predicate3.test("Java"));
		
		Consumer consumer1 = new Consumer() {
			@Override
			public void accept(Object t) {
				System.out.println(t);
			}
		};
		
		consumer1.accept(100);
		consumer1.accept("Hello");
		
		Consumer consumer2 = (t) -> System.out.println(t);
		consumer2.accept(10000);
		
		Supplier supplier1 = new Supplier() {
			@Override
			public Object get() {				
				return "Hello";
			}
		};
		
		System.out.println(supplier1.get());
		
		Supplier supplier2 = () -> 100000;
		
		System.out.println(supplier2.get());
		
	
		
	}

}
