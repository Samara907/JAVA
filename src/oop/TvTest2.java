package oop;

/*class Tv {
	// Tv's Property(member variable)
	String color;
	boolean power;
	int channel;
	
	// Tv's Function(method)
	void power () { power = !power; }
	void channelUp () { ++channel; }
	void channelDown () { --channel; }
}*/
public class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1's channel value is " + t1.channel);
		System.out.println("t2's channel value is " + t2.channel);
		
		t1.channel = 7;
		System.out.println("t1's channel change value is " + 7);
		
		System.out.println("t1's channel value is " + t1.channel);
		System.out.println("t2's channel value is " + t2.channel);
	}
}
