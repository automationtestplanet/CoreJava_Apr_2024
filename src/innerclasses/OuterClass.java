package innerclasses;

public class OuterClass {
	
	static class StaticInnerClass{		
		void method1() {
			System.out.println("This is StaticInnerClss method1");
		}
	}
	
	class InstanceIneerClass{
		void method2() {
			System.out.println("This is InstanceIneerClass method2");
		}
	}
	
	static { // static block
		
		System.out.println("This is Static block");
		
	}
	
	{ // anonymous class
		System.out.println("This is Anonymous class");
	}
	
	interface InnerInterface1{
		
	}
	
	enum Enum1{
		MONDAY;
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		
		OuterClass outCLs = new OuterClass();
		
		OuterClass.StaticInnerClass staticInrCls = new StaticInnerClass();
		staticInrCls.method1();
		
		OuterClass.InstanceIneerClass instanceInrCls = outCLs. new InstanceIneerClass();
		
		instanceInrCls.method2();
	}

}
