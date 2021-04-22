/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Display_Screen implements SelfCheckCapable {
	String software;
	String glass_screen;
	double image_resolution;
	String data_card;
	String led_module;
	String text;
	String touch_sensors;
	String next_button;



	void receives_messages() {
	}
	
	void temperature() {
	}
	
	public String dislay_messages() {
		return null;
	}
	
	public String display_nextstep() {
		return null;
	}
	public String excutes_next_command() {
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
