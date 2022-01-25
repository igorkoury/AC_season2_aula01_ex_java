class ExMissingChar {
	
	public static void main(String[] args) {
		missingChar("Robocop", 3);
	};

private static void missingChar(String str, int number) {
	String str1 = str.substring(0, number);
	String str2 = str.substring(number + 1);
	System.out.println(str1 + str2);
};
};

