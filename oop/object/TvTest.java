package object;

class Tv {
	// Tv's Property(member variable)
	String color;
	boolean power;
	int channel;
	
	// Tv's Function(method)
	void power () { power = !power; }
	void channelUp () { ++channel; }
	void channelDown () { --channel; }
}
public class TvTest {
	public static void main(String args[]) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("channel's value is " + t.channel);
	}
}
