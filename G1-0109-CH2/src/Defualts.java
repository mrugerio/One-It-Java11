
public class Defualts {
	
	static long l;
	static float f;
	static double d;

	public static void main(String[] args) {
		System.out.println(l); //0
		System.out.println(f); //0.0
		System.out.println(d); //0.0
	}

}

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
//No aplica para variables locales
//byte	0
//short	0
//int	0
//long	0L
//float	0.0f
//double	0.0d
//char	'\u0000'
//String (or any object)  	null
//boolean	false
