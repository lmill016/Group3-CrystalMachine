/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Employee implements SelfCheckCapable {
	String gender;
	String name;
	String position;
	
	public String works() {
		return null;
	}
	public String pass_through_door() {
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
