package oppg2;

public class Burger {

	private static int count;

	private final int id;

	public Burger() {
		id = ++count;
	}

	@Override
	public String toString() {
		return String.format("(%s)", id);
	}
}