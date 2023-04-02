package week0304Assignment;

import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		
	//1.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 45};
	System.out.println(ages[ages.length - 1] - ages[0]);

	
	//2a.
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	int total = 0;
	for(int i = 0; i < names.length; i++) {
		total += names[i].length();
	}
	
	int average = total / names.length;
	System.out.println(average);
	
	
	//2b.
	String allNames = "";
	for(int i = 0; i < names.length; i++) {
		if (i == 0) {
			allNames += names[i];
		}else {
			allNames+= " " + names[i];
		}
	}
	System.out.println(allNames);
	
	//3.
	System.out.println(names[names.length - 1]);
	
	
	//4.
	System.out.println(names[0]);
	
	
	//5. 
	int[] nameLengths = new int[names.length];
	
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	}
	System.out.println(Arrays.toString(nameLengths));
	
	
	//6.
	int namesSum = names.length;
	System.out.println(namesSum);

	
	//7a.
	String word = "Hello";
	int n = 3;
	String repeatedWord = repeatWord(word, n);
	System.out.println(repeatedWord);
	 

	//8a. 
	String firstName = "Barry";
	String lastName = "Johnson";
	String fullName = getFullName(firstName, lastName);
	
	System.out.println(fullName);
	
	
	//9a.
	int[] numbers = {45, 72, 83};
	boolean result = isSumGreaterThan100(numbers);
	System.out.println(result);
		
	//10a.
	double[] randomNumbers = {2.5, 3.7, 22.1, 6.2};
	double randomNumbersAverage = calculateAverage(randomNumbers);
	System.out.println(randomNumbersAverage);
    
	
	//11a.
	double[] randomNumbers02 = {6.4, 8.3, 12.8, 9.6};
	boolean result02 = compareAverages(randomNumbers02, randomNumbers);
	System.out.println(result02);
     
	
	//12a.
	boolean willBuy = willBuyDrink(true, 1.75);
	System.out.println(willBuy);
     
	
	//13a.
     //will I go grocery shopping today? Needs: > $100 in wallet and gas in car
	boolean willGo = willGoGroceryShopping(120.0, true);
	System.out.println(willBuy);
     
			
}
	
	
	
	//7b.
	public static  String repeatWord(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}
			
	//8b.
	public static String getFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	//9b.
	public static boolean isSumGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum > 100;
	}
	
	//10b.
	public static double calculateAverage(double[] randomNumbers) {
		double sum = 0;
		for(int i = 0; i < randomNumbers.length; i++){
			sum += randomNumbers[i];
		}
		double randomNumbersAverage = sum / randomNumbers.length;
		return randomNumbersAverage;
	}
	 
	//11b.
	public static boolean compareAverages(double[] array1, double[] array2) {
		double sum1 = 0, sum2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		double avg1 = sum1 / array1.length;
		
		for(int i = 0; i < array2.length; i++) {
			sum2 =+ array2[i];
		}
		double avg2 = sum2 / array2.length;
		return (avg1 > avg2);
	}
	
	//12b.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	 
	//13b.
	public static boolean willGoGroceryShopping(double walletBalance, boolean hasGasInCar) {
		if(walletBalance > 100 && hasGasInCar) {
			return true;
		}else {
			return false;
		}
	}
	 
	
}



