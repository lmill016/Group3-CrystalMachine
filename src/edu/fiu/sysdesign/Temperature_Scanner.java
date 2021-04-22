/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Temperature_Scanner implements SelfCheckCapable {
	String opx_technology; /** temperature taking system in the scanner **/
	String laser; /** laser in the scanner **/
	String lamp; /** lamp of the scanner **/
	String CCDarray;
	

	void scans_temperature() {
		/** laser in the scanner **/
	}
	
	public String send_temperature() {
		/** temperature scanner can send data **/
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



}
