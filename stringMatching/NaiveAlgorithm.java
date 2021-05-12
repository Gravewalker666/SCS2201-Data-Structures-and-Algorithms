class NaiveAlgorithm {
	
	public static void main (String[] args) {
		String text = "ABBCABBCBCCABCDABCFGCD";
		String pattern = "ABCD";
		System.out.println(text);
		System.out.println(pattern);
		search(text, pattern);
	}

	public static void search (String text, String pattern) {
		int textLength = text.length();
		int patternLength = pattern.length();
		for (int i = 0; i <= textLength - patternLength; i++) {
			int j;
			for (j = 0; j < patternLength; j++) {
				System.out.println(i + " " + j);
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}
			System.out.println(j);
			if (j == patternLength) {
				System.out.println("Pattern found at the index: " + i);
				i += patternLength - 1;
			}
		}
	}
}
