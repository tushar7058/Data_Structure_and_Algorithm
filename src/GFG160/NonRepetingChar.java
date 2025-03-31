class NonRepetingChar{
	public static void main(String[] args) {
		
		String s = "foundoff";
		System.out.println(NoRepetingChar(s));
	}
	static char NoRepetingChar(String s){
		// brute approach
		int n = s.length();

		for(int i=0;i<n;++i){
			boolean found = false;

			for(int j =0;j<n;++j){
				if(i!=j && s.charAt(i)==s.charAt(j)){
					found =true;
					break;
				}
			}
			// if does not repeter
			if(found == false){
				return s.charAt(i);
			}
		}
		return '$';
	}
}