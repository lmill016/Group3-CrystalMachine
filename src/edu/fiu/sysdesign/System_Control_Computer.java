/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class System_Control_Computer implements SelfCheckCapable {
	String system_Manager;
	String databse;
	String computer;
	String processor;
	String ram;
	String memory;
	
	
	void receive_Machine_Reports() {
		
	}
		
		void review_System_Checks() {
			
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
