package SituationBased;

import java.util.Arrays;
import java.util.LinkedHashSet;

//How to remove duplicates from a given array in Java
public class RemoveDuplicateinArray {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
        System.out.println( Arrays.toString(numbers) );
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
	}

}
