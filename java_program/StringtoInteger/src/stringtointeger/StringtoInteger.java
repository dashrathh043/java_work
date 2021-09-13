package stringtointeger;

public class StringtoInteger {
	
	public int myAtoi(String s) {
		s = s.trim();
		if(s.length()==0)
			return 0;
		String temp_str = "";
		boolean bool = false;
        if(s.charAt(0) == '-') {
        	bool = true;
        	s = s.substring(1);
        }
        if(s.charAt(0)>57 || s.charAt(0)<48)
        	return 0;
        
        for(int i = 0;i<s.length();i++) {
        	if(s.charAt(i)>=48 && s.charAt(i)<=57)
        		temp_str+=String.valueOf(s.charAt(i));
        	else
        		break;
        }
        String final_temp_str = "";
        int final_value = 0;
        if(bool == true)
        	final_temp_str = "-"+temp_str;
        else
        	final_temp_str = temp_str;
        try {
         final_value = Integer.parseInt(final_temp_str);
        }
        catch(Exception e){
        	if(bool == true)
        		return Integer.MIN_VALUE;
        	else
        		return Integer.MAX_VALUE;
        }
        return final_value;
        
    }
	
	 public int myAtoi_2(String s) {
		 int flag = 1, final_result = 0,index = 0;
	        while(index<s.length() && s.charAt(index) == ' ')
	            index++;
	        if(index<s.length() && s.charAt(index) == '-'){
	            flag = -1;
	            index++;
	        }
	        else if(index<s.length() && s.charAt(index)== '+'){
	            index++;
	        }
	        while(index<s.length()){
	            int index_value = s.charAt(index)-'0';
	            if(index_value<0 || index_value>9)
	                break;
	            if(final_result>Integer.MAX_VALUE/10 || final_result == Integer.MAX_VALUE/10 && Integer.MAX_VALUE%10<index_value)
	                return flag == 1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
	            final_result = 10*final_result+index_value;
	            index++;
	        }
	        return flag*final_result;
	    }

	public static void main(String[] args) {
		StringtoInteger obj = new StringtoInteger();
		System.out.println(obj.myAtoi_2("-91283472332"));

	}

}
