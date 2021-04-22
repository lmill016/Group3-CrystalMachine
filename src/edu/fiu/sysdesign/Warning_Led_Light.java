/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Warning_Led_Light implements SelfCheckCapable {
	String optics; /** warning led lights have optics **/
	String chips; /** warning led lights have chips **/
	String heat_sink; /** warning led lights have heat sinks **/
	String circuit_board; /** warning led lights have circuit board **/

	void flash_light() {
		/** warning led lights can flash **/
	}
	
	public String getData() {
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
