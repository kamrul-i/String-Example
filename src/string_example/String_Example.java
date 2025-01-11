package string_example;
public class String_Example {
	public static void main(String[] args) {

		// String এর বিভিন্ন ব্যবহার পদ্ধতি দেখানো হয়েছে।।================
		// String declare system -1------------------------
		String str = "Java Developer";
		String string = new String(str);
		System.out.println(string);

		// String declare system -2------------------------
		String str1 = new String("Android Developer.");
		System.out.println(str1);

		// String declare system -3------------------------
		char[] str2 = { 'S', 'u', 'c', 'c', 'e', 's', 's' };
		System.out.println(str2);
	}
	/*
	 * what is String ? String is a sequence of character, it is used in normal programming. 
	 * it is an object for Java programming, that object is a sequence of character. 
	 * 
	 * Different String methods: length(); equals(), equalsIgnoreCase(), contains(); isEmpty();
	 */
}