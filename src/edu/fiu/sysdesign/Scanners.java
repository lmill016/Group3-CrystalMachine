/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Scanners implements SelfCheckCapable {
	String technology; /** Scanners have technologies **/
	String laser; /** Scanners have Lasers **/
	String preexisting_data; /** Scanners have prexisting data **/
	String lamp; /** Scanners have lamps **/
	String CCDdevice; //** CHarged coupled device array **// 
	
	
	/**
	 * This is the Rover method, initiates a new rover
	 * */
	 

	void scans_objects() {
		/** Scanners scans objects **/
		
	}
	void sends_test_results() {
		/** Scanners send test results **/
	}	@Override
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
