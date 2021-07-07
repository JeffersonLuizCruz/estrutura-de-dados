package com.estruturadedados.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaApplication {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> result = list.stream()
								   .map(e -> e * 2)
								   .collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> convertToString = list.stream()
											.map(e -> String.valueOf(e))
											.collect(Collectors.toList());
		
		System.out.println(convertToString);
	}

}
