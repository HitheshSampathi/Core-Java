import java.util.Comparator;

public class SortBasedOnName  implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		Student st1=(Student)ob1;
		Student st2=(Student)ob2;
		return st1.compareTo(st2);
	}

}
