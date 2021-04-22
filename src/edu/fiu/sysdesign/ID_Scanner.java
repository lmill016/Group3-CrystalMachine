/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Leonardo Miller
 *
 */
public class ID_Scanner implements SelfCheckCapable {
	String barcode_technology; /** ID scanner has barcodes **/
	String laser; /** ID scanner has laser **/
	boolean preexisting_barcode; /** ID scanner a log of barcodes **/
	String lamp; /** ID scanner has a lamp **/
	String CCDarray; 

	void scan_barcode() {
		/** ID scanner can scan barcodes **/
	}
	
	public String sends_pass() {
		/** barcodes scans can be successful **/
		return null;
	}
	
	public String sends_fail() {
		/** barcodes scans can be unsuccessful **/
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
