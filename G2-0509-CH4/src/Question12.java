
public class Question12 {

	public static void main(String[] args) {
		char[] wolf = {'W', 'e', 'b', 'b', 'y'};
		
		int q = wolf.length; //5 
		
		for( ; ; ) {
			System.out.print(wolf[--q]);
			if(q==0) break; 
		}
		System.out.println("");
		for(int m=wolf.length-1; m>=0; --m)
			System.out.print(wolf[m]);
		System.out.println("");
		for(int z=0; z<wolf.length; z++)
			System.out.print(wolf[wolf.length-z]);
	}

}
