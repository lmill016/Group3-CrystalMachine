/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class System_Control_Computer implements SelfCheckCapable {
	String system_Manager; /** System Control computer has system managers **/
	String databse; /** System control contains database **/
	String computer; /** System control uses computer **/
	String processor;  /** System control uses processor **/
	String ram; /** System control uses ram **/
	String memory; /** System control uses memory **/
	
	
	void receive_Machine_Reports() {
		/** System control receives machine reports **/
		
	}
		
		void review_System_Checks() {
			/** System control reviews system checks **/
			
	}
	
		public String stores_Data_Received() {
			return null;
			/* returns string link of picture in web database */
		}

	
	public String fix_Errors() {
		return null;
		/* returns string link of video in web database */
	}
	public Object sends_Commands() {
		return null;
		/* returns string link of video in web database */
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
