package parvej;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_filter {
	
	public static void main(String[] args)
	{
		List<String> name = Arrays.asList("Hemant", "Shahid bhai", "naya wala", "Captital se aaye huye", "bechare pese kamane wale");
		Stream<String> allname = name.stream();
		Stream<String> longname = allname.filter(str -> str.length() >= 6);
		longname.forEach(str -> System.out.println(str));
	}

}
