
public class Question04 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(); 
		sb.append("aaa").insert(1, "bb")
						.insert(4, "ccc");
		//abbaccca
		System.out.println(sb);
	}

}
