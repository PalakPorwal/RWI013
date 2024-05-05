import java.util.*;
class HashMap1{

	public static void main(String args[])
	{
		HashMap<Integer, String> hMap1 = new HashMap<>();
		HashMap<Integer, String> hMap2 = new HashMap<>();

		hMap1.put(1, "Java");
		hMap1.put(2, "C");
		hMap1.put(3, "Python");

		hMap2.put(4, "Javascript");
		hMap2.put(5, "Kotlin");
		hMap2.put(6, "Go");

		System.out.println("HashMap hMap1 : "	+ hMap1);

		System.out.println("HashMap hMap2 : "	+ hMap2);
	}
}

