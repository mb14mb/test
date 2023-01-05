package program4;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class client_main {
	
	public static void main(String args[]) {
		
		CoapClient cl=new CoapClient("coap://192.168.137.1/humidity");
		for(int i=0;i<10;i++)
		{
		String text;
		try {
		text=cl.get().getResponseText();
		System.out.println("humidity"+text);
		Thread.sleep(1000);

		}
		catch(ConnectorException e)
		{
		System.out.println(e);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}


}
