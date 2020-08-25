package service;

public class PersonalityCalculator {
	public String findYourBrainType(String options) {
		int[] listOfArray = findAnswers(options);
		String result = "";
		int a = 0;
		int b = 0;
		for (int i = 0; i < listOfArray.length; i++) {
			if (i == 3 || i == 5 || i == 6 || i == 8 || i == 12 || i == 14 || i == 15 || i == 16 || i == 18) {
				b = b + listOfArray[i];
			} else {
				a = a + listOfArray[i];
			}
		}
		int X = 66 - a + b;
		if (X >= 20 && X <= 100) {
			if (X >= 22 && X <= 55) {
				result = "leftbrained";
			} else if (X >= 56 && X <= 64) {
				result = "noclearpreference";
			} else {
				result = "rightbrained";
			}
			System.out.println("Your Total Score is:" + X + ". You are " + result);
		}
		return result;

	}

	public int[] findAnswers(String options) {
		String[] str = options.split("");
		int[] arr = new int[20];
		int counter = -1;
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(",")) {
				arr[++counter] = Integer.parseInt(str[i]);
			}
		}
		return arr;
	}

}
