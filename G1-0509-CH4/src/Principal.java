
public class Principal {

	public static void main(String[] args) {

		var dayOfWeek = 5;
		switch (dayOfWeek) {

		case 0:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		}

	}

}
