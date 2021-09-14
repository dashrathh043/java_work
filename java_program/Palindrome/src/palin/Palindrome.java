package palin;

public class Palindrome {
	public boolean isPalindrome(int x) {
        String s_str = String.valueOf(x);
        StringBuffer sbuffer = new StringBuffer(s_str);
        StringBuffer rev = sbuffer.reverse();
        return s_str.equals(rev.toString());
    }

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		System.out.println(obj.isPalindrome(10));
		// TODO Auto-generated method stub

	}

}
