package longest_palindromic_substring;

public class Longest_palindromic_substring {
	
	public boolean isPalindrome(String s_str) {
        StringBuffer sbuffer = new StringBuffer(s_str);
        String rev = sbuffer.reverse().toString();
        return s_str.equals(rev);
    }
    
    public String longestPalindrome(String s) {
    	String result = "";
    	for(int i = s.length();i>0;i--) {
    		for(int j=0;i+j<=s.length();j++) {
    			String substring = s.substring(j,i+j);
    			if(isPalindrome(substring) && substring.length()>result.length())
    				result = substring;	
    		}
    	}
    	return result;
      
    }

	public static void main(String[] args) {
		Longest_palindromic_substring obj = new Longest_palindromic_substring();
		System.out.println(obj.longestPalindrome("ac"));

	}

}
