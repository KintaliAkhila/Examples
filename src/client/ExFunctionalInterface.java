package client;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//import com.Consumer;

public class ExFunctionalInterface {
	
	
	public static void main(String[] args) {
		
		
		Consumer<String> consumer=(String str)->System.out.println(str);
		consumer.accept("Hello");
		
		Supplier<String> supplier=()->"Hello from supplier";
		consumer.accept(supplier.get());
		
		Predicate<Integer> predicate=num->num%2==0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(15));
		
		BiFunction<Integer,Integer,Integer> maxFunction=(x,y)->x>y?x:y;
		System.out.println(maxFunction.apply(25, 14));
		
		
		
		
		
	}
	
	
	

}
