public class MaximumNumberOfVowelsInSubstringOfGivenLength {

	public static void main(String[] args) {
		String s = "askdfnedvjkhoiduvoiaedjfkasbduiciweaij";
		int k = 6;
		
		 String vowelSet = "aeiou";
	        int vowelCount = 0;
	        for (int i=0;i<k;i++){
	            if(vowelSet.indexOf(s.charAt(i)) != -1) vowelCount++;
	        }
	        int maxVowelCount = vowelCount;

	        for(int i =k;i<s.length();i++){
	            if(vowelSet.indexOf(s.charAt(i)) != -1) vowelCount++;
	            if(vowelSet.indexOf(s.charAt(i-k)) != -1) vowelCount--;

	            maxVowelCount = Math.max(maxVowelCount,vowelCount);
	        }
	        System.out.println(maxVowelCount);
	}

}
