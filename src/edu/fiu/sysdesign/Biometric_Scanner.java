/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Biometric_Scanner implements SelfCheckCapable {
	String iris_technology;
	String laser;
	String preexisting_biometrics;
	String lamp;
	String CCDarray;
	

	void scans_iris() {
	}
	
	public String sends_pass() {
		return null;
	}
	public String sends_fais() {
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
