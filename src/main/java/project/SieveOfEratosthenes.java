package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// running a quick test in the beginning
		testProgram();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
		Integer input;
		try {
			input = Integer.parseInt(reader.readLine());
			System.out.println(runSieveOfEratosthenesAlgorithm(input));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	private static void testProgram() {
		Integer testNum = 30;
		
		List<Integer> output = Arrays.asList(2, 3, 5, 7, 11, 13, 17,19,23,29);
		
		List<Integer> actualOutput = runSieveOfEratosthenesAlgorithm(testNum);
		
		if(output.equals(actualOutput)) {
			System.out.println("Test Passed");
		} else{
			System.out.println("Test Failed");
		};
	}
	

	private static List<Integer> runSieveOfEratosthenesAlgorithm(Integer input) {
		List<Integer> output = new ArrayList<Integer>();

		// get all of the numbers starting at 2 up till the input
		for (int i = 2; i <= input.intValue(); i++) {
			// add all values to our output list
			output.add(i);
		}

		// if i is 2 or is another prime number find its multiples and remove them
		for (int i = 2; i <= input.intValue(); i++) {
			if (i == 2 || i % 2 == 1) {

				List<Integer> multiples = new ArrayList<Integer>();
				// first get a list of the prime's multiples
				for (int j = i + i; j <= input.intValue(); j += i) {
					multiples.add(j);
				}

				// set the 'stop' value to true unless proven otherwise
				boolean stop = true;

				// if none of the multiples are in the output list stop else continue
				for (Integer multiple : multiples) {
					if (output.contains(multiple)) {
						output.remove(multiple);
						stop = false;
					}
				}
				if (stop == true) {
					break;
				}
			}
		}

		return output;
	}

}
