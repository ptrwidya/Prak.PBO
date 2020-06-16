package projek;

public class CastingData {
	public static void main(String[] args) {
		byte a = 50;
		int b = 5;
		int c = 2;
		
		float d = (int)(a*b/c);
		float e = (int)(a*b)/251;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
	}
}
