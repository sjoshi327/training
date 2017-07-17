package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSimple {

	public static void main(String[] args) {
	/*	Thread th = new Thread(new Runnable() {
			@override
			public void run() {
				System.out.println("Inside Thread");
			}
		});*/
		/*Thread th= new Thread(()->System.out.println("Inside thread"));
         th.start();*/
		// method 1 without enhanced for loop
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i));
	}
		//with enhanced for loop
		for(Integer i:numbers) {
			System.out.print(i);
		}
		// method with consumer interface
		/*numbers.forEach(new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});*/
		
		//numbers.forEach((t)->System.out.println());
		
		//converting consumer into lambda
		numbers.forEach((Integer value)->System.out.println(value));
		
		//remove obvious parameter and use method reference
		numbers.forEach(System.out::println);
				

}
}