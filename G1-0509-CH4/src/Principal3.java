
public class Principal3 {

	private int getSortOrder(String firstName, final String lastName) {
		final String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;

		switch (firstName) {
		case "tercio":
			return 52;
		case middleName:
			id = 5;
			break;
		}
		return id;
	}

}
