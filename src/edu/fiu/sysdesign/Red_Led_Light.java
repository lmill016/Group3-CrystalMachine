/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Red_Led_Light implements SelfCheckCapable {
	String optics; /** optics on red light **/
	String chips;  /** chips on red light **/
	String heat_sink;  /** heat sink on red light **/
	String circuit_board;  /** circuit board on red light **/

	void flash_red_light() {
		 /** red light can flash**/
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
