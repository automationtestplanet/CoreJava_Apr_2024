package oops;

public class ConstructorExample {

	boolean bool1;
	byte byte1;
	short short1;
	char char1;
	int int1;
	long long1;
	float float1;
	double double1;
	String string1;

	ConstructorExample() {

	}

	ConstructorExample(boolean bool1, char char1, int int1, long long1, float float1,
			double double1, String string1) {
		this.bool1 = bool1;
		this.char1 = char1;
		this.int1 = int1;
		this.long1 = long1;
		this.float1 = float1;
		this.double1 = double1;
		this.string1 = string1;
	}

	void printGlobal() {
		System.out.println(bool1);
		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(char1);
		System.out.println(int1);
		System.out.println(long1);
		System.out.println(float1);
		System.out.println(double1);
		System.out.println(string1);
	}

	public static void main(String[] args) {

		ConstructorExample cosnEx1 = new ConstructorExample();

		cosnEx1.printGlobal();
		
		System.out.println("-------------------------------------------");
		ConstructorExample cosnEx2 = new ConstructorExample(true, 'A', 1000, 10000, 100.5F, 1000.5087D, "Hello");
		
		cosnEx2.printGlobal();

	}

}
