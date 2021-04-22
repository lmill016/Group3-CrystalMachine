/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class Data_Storage implements SelfCheckCapable {
	String capacity; /** data storage have a capacity **/
	String preexisting_data;
	String collected_data; /** data storage have a can collect data **/
	
void stores_Data() {
	/** data storage stores data **/
		
	}

void receives_Data() {
	/** data storage receives data to store **/
	
}

void returns_Data() {
	/** data storage can return data **/
	
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


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

}
