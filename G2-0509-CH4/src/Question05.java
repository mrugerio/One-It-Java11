
public class Question05 {
	
	public static void main(String args[]) {
		new Question05().print(new int[]{3,4,5});
	}

	private void print1(int[] weather) {
		for (int i=weather.length-1; i>=0; i--) {
			//System.out.println(i);
			System.out.println(weather[i]);
		}
	}
	
	private void print2(int[] weather) {
		for (int i=0; i<=weather.length-1; ++i) {
			System.out.println(weather[i]);
		}
	}
	
	private void print3(int[] weather) {
		for (var w : weather) {
			//System.out.println(weather[i]);
		}
	}
	
	private void print4(int[] weather) {
		for (int i=0, j=3; i<weather.length; ++i) {
			System.out.println(weather[i]);
		}
	}
	
	private void print(int[] weather) {
		for (int i=-1; ++i<10 && i<weather.length;) {
			System.out.println(weather[i]);
		}
	}
	

}
