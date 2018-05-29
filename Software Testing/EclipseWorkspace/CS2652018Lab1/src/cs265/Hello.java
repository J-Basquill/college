package cs265;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Demonstration Java program: print "Hello"
 * @author James Basquill
 * @author 17186285
 */
public class Hello {
	public static void main (String args[]){
		System.out.println("Hello");
		InetAddress ip;
		String hostname;
		try{
			ip=InetAddress.getLocalHost();
			hostname = ip.getHostName();
			System.out.println("My current IP Address is : "+ip);
			System.out.println("My current IP Address is : "+hostname);
			System.out.println("Please make note of these for Moodle later");
			
		} catch (UnknownHostException e){
			e.printStackTrace();
		}
	}
}
