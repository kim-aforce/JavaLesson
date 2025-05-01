import org.apache.commons.lang3.StringUtils;

public class library_practice {

	public static void main(String[] args) {

		String reversed = StringUtils.reverse("example");
		String trimmed = StringUtils.trim("example");
		boolean contains = StringUtils.contains("example", "amp");
		
		System.out.println(reversed);
		System.out.println(trimmed);
		System.out.println(contains);
		
	}

}
