package multithreading;

public class MultipleThreads{

	public static void main(String[] args) {
//		Class1 cls1 = new Class1();
//		Class2 cls2= new Class2();
//		cls1.start();
//		cls2.start();
		
		
//		Thread thread1 = new Thread(new Class3());
//		Thread thread2 = new Thread(new Class4());
//		thread1.start();
//		thread2.start();
		
		Thread thread1 = new Thread(new Class3());
		Thread thread2 = new Thread(new Class3());
		thread1.start();
		thread2.start();
	}

}
