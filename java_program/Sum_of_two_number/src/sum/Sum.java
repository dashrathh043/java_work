/**
 * 
 */
package sum;

/**
 * @author dashr
 *
 */
public class Sum {
	int a,b;

	/**
	 * 
	 */
	public Sum() {
	}
	
	public int sum(int a,int b) {
		return a+b;
	}

	
	public static void main(String[] args) {
		Sum obj = new Sum();
		obj.a = 2;
		obj.b = 3;
		System.out.println(obj.sum(obj.a, obj.b));

	}

}
