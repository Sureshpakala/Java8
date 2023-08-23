package StaticKeyWors;

public interface Calculations {
	public static int addition(int a,int b) {
		return a+b;
	}
	public default int subraction(int c,int d) {
		return c-d;
	}
}
