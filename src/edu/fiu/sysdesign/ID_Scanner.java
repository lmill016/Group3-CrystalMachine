/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class ID_Scanner implements SelfCheckCapable {
	String barcode_technology;
	String laser;
	boolean preexisting_barcode;
	String lamp;
	String CCDarray;

	void scan_barcode() {
	}
	
	public String sends_pass() {
		return null;
	}
	
	public String sends_fail() {
		return null;
	}
	
	@Override
	public String getComponentName() {
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

}
