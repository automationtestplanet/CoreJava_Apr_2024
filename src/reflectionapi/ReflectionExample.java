package reflectionapi;


import java.lang.reflect.Method;

import fundamentals.Calculator;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		
		Calculator calc = new Calculator();
		
		Method[] allMethods= Calculator.class.getMethods();
		
		for(Method eachMethod : allMethods) {
			System.out.println(eachMethod.getName());
		}
		
		Object[] args1 = {100,200};
		
		for(Method eachMethod : allMethods) {
			if(eachMethod.getName().equalsIgnoreCase("addition")) {
				eachMethod.invoke(calc, args1);
			}
		}
		
		Method susbMethod = Calculator.class.getDeclaredMethod("substraction",int.class,int.class);
		susbMethod.setAccessible(true);		
		susbMethod.invoke(calc,args1);
		
		Method mulMethod = Calculator.class.getDeclaredMethod("multiplication",int.class,int.class);
		mulMethod.setAccessible(true);		
		mulMethod.invoke(calc,args1);
		
		Method divMethod = Calculator.class.getDeclaredMethod("division",int.class,int.class);
		divMethod.setAccessible(true);		
		divMethod.invoke(calc,args1);
		

	}

}
