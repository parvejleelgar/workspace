package parvej;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Foreach {

	public static void main(String[] args)
	{
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		
		arrL.add(20);
		arrL.add(30);
		arrL.add(29);
		
		
		
		arrL.forEach(n -> System.out.println(n));
		
	}
}
