/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Display_Screen implements SelfCheckCapable {
	String software; /** Display Screen has software **/
	String glass_screen; /** Display Screen have glass screens **/
	double image_resolution; /** Display Screen has image resolution **/
	String data_card; /** Display Screen have data card **/
	String led_module; /** Display Screen have an led module **/
	String text; /** Display Screen has software **/
	String touch_sensors; /** Display Screen have touch screens **/
	String next_button; /** Display Screen have a next button **/



	void receives_messages() {
		/** Display Screen can receive messages **/
	}
	
	void temperature() { 
		/** Display Screen calculates temperature **/
	}
	
	public String dislay_messages() {
		/** Display Screen can display messages **/
		return null;
	}
	
	public String display_nextstep() {
		/** Display Screen can display next steps **/
		return null;
	}
	public String excutes_next_command() {
		/** Display Screen can rexecute next command **/
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
