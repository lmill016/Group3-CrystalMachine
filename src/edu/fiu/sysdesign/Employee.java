/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Employee implements SelfCheckCapable {
	String gender; /** Employees have genders **/
	String name; /** Employees have names **/
	String position; /** Employees have positions **/
	
	public String works() {
		/** Employees have work indicators **/
		return null;
	}
	public String pass_through_door() {
		/** Employees can pass through doors**/
		return null;
	}
	
	public String check_In() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

}
