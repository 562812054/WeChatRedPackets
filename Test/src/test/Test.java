package test;

public class Test {
	public static void main(String[] args) {
		String a ="NICE_CAMEL";
		String b = "A_Good_IDEA";
		String c = "FaceBook";
		a = toTuoFrng(a);
		b = toTuoFrng(b);
		c = toTuoFrng(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	private static String toTuoFrng(String item) {
		item = item.toLowerCase();
		String[] letters = item.split("_");
		String newItem = letters[0];
		for(int i = 1;i<letters.length;i++){
			newItem = newItem+letters[i].substring(0,1).toUpperCase()+
			letters[i].substring(1);
			
		}
		return newItem;
	}
}
