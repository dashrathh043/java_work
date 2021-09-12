package reverse;

public class Reverseinteger {
	    public int reverse(int x) {
	       boolean bool = false;
	        long rev_num = 0;
	        if(x<0){
	            bool = true;
	            x = Math.abs(x);
	        }
	        
	        while(x>0){
	            int rem = x%10;
	            rev_num = (rev_num*10)+rem;
	            x = x/10;
	        }
	        
	        if(bool == true)
	            rev_num = -1*rev_num;
	        
	        if(rev_num>=Integer.MAX_VALUE||rev_num<=Integer.MIN_VALUE)
	            return 0;
	        return (int)rev_num;
	        
	    }

	public static void main(String[] args) {
		Reverseinteger obj = new Reverseinteger();
		System.out.println(obj.reverse(1534236469));
	}

}
