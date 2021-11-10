import java.util.AbstractList;

public class MyList extends AbstractList<Integer> {
	private int first, last;
	public MyList(int first, int last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public Integer get(int index) {
		int current;
		current = index + first;
		if (current > last) {
			throw new IndexOutOfBoundsException("");
		}
		return current;
	}

	@Override
	public int size() {
		return last - first + 1;
	}
}
