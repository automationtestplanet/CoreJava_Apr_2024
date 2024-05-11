package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ClassAnnotation(value1 = 100, value2 = 200)
public class AnnotationExample {
	
	@VariableAnnotation(varable1 = "Hello", varable2 = "Java")
	public String varable1;
	
	
	@MethodAnnotation(param1=1000,  param2 = 2000)
	public void method1() throws Exception {
		Method method1 = AnnotationExample.class.getDeclaredMethod("method1");
		
		MethodAnnotation mehodAnno = method1.getAnnotation(MethodAnnotation.class);
		
		System.out.println(mehodAnno.param1());
		System.out.println(mehodAnno.param2());
	}

	public static void main(String[] args) throws Exception {
		AnnotationExample annoEx = new AnnotationExample();
		
		ClassAnnotation clsAnno = AnnotationExample.class.getAnnotation(ClassAnnotation.class);		
		System.out.println(clsAnno.value1());
		System.out.println(clsAnno.value2());
		
		annoEx.method1();
		
		Field varField = AnnotationExample.class.getField("varable1");
		
		VariableAnnotation varAnno = varField.getAnnotation(VariableAnnotation.class);
		
		System.out.println(varAnno.varable1());
		
		System.out.println(varAnno.varable2());

	}
}
