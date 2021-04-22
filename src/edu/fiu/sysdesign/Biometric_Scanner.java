/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Biometric_Scanner implements SelfCheckCapable {
	String iris_technology;  /** biometric scanners have eye iris scanning **/
	String laser; /** biometric scanners have lasers **/
	String preexisting_biometrics; /** biometric scanners have scan log **/
	String lamp; /** biometric scanners have lamp  **/
	String CCDarray; 
	

	void scans_iris() {
		/** biometric scanners can scan an iris  **/
	}
	
	public String sends_pass() {
		/** biometric scanners can be sucessful upon scanning  **/
		return null;
	}
	public String sends_fais() {
		/** biometric scanners can be unsusseful upon scanning  **/
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
