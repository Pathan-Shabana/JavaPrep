import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4,5);
		nums.stream().filter(n -> n%2 ==0).forEach(nu->System.out.print(nu));

	}

}
