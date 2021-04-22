/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Surveillance_Camera implements SelfCheckCapable {
	String lens; /** surveillance camera has lens **/
	String Focus; /**  camera has focus **/
	String microphone; /** surveillance camera has microphone **/
	String charged_couple_device; 
	String flash; /** surveillance camera has flash **/
	
	void  record_video() {
		/** surveillance camera can record videos **/

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
