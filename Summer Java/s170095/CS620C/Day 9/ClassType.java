/* James Basquill
17186285*/

public class ClassType 
{
	private int attribute1; 					// each created object has its own one
	public ClassType( int num ) 				// notice NO return type
	{ 
		attribute1 = num;						// set attribute value on construction
	}
	public void setAttribute1( int num) 		// sets the attribute
	{ 
		attribute1 = num;
	}
	public int getAttribute1( ) 				// gets the attribute
	{ 
		return attribute1;
	}
												// end of ClassType definition



	public static void main (String [ ] args)
	{
		ClassType myObjRef = new ClassType(0);
		//myObjRef.setAttribute1(15);
		int value = myObjRef.getAttribute1( );	// get the object’s attribute value
		System.out.println("Value of attribute1 :" + value);
	}											// end of main method
}											// end of TestingClassType