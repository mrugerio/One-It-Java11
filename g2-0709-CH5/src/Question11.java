
public class Question11 {

	public static void main(String[] args) {
		StringBuilder numbers = new StringBuilder("0123456789"); 
		numbers.delete(2, 8); //0189
		numbers.append("-").insert(2, "+"); 
		            //0189-         //01+89-  
		System.out.println(numbers);
		
		//StringBuilder b = "rumble";
		StringBuilder b = new StringBuilder("rumble");
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1); 
		//rumble4     //rumle4  rum4    
		System.out.println(b);
	}

}
