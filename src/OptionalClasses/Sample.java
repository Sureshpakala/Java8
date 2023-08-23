package OptionalClasses;

import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		Optional<String> value = Optional.of("Raja");
		System.out.println(value.get());
		Optional<String> value1 = Optional.ofNullable(null);
		System.out.println(value1);
		Optional<String> value2 = Optional.ofNullable("Suresh");
		System.out.println(value2.isEmpty());
		Optional<String> value3 = Optional.ofNullable("Ramesh");
		System.out.println(value3.isPresent());
		Optional<String> value4 = Optional.ofNullable("Ravi");
		System.out.println(value4.orElse("Raghul"));
//		Optional<String> value5 = Optional.ofNullable(null);
//		System.out.println(value5.orElseThrow("Raki"));
	}
}