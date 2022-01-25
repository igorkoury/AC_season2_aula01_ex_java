class ExNotString {
	
	public static void main(String[] args) {
		
		notString("semicolon");
		notString("not semicolon");
	}

	private static void notString(String str) {
		if(str.contains("not ")) {
			System.out.println(str);
		} else {
			System.out.println("not " + str);
		};

	};
};
