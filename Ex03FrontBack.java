class Ex03FrontBack {

	public static void main(String[] args) {
	
		frontBack("heisenberg");
	};

	private static void frontBack(String str) {

		String str1 = str.replace(str.charAt(0), str.charAt(str.length()-1));
		String str3 = str1.substring(0, str.length() -2) + str.charAt(0); 
		System.out.println(str3);
	};	

};

