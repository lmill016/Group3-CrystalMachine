/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Green_Led_Light implements SelfCheckCapable {
	String optics; /** optics on green light **/
	String chips;  /** chips on green light **/
	String heat_sink;  /** heat sink on green light **/
	String circuit_board;  /** circuit board on green light **/

	void flash_green_light() {
		 /** green light can flash**/
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
