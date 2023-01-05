package program4;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class server_main extends CoapResource {

	public server_main(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	int i=0;
	public void handleGET(CoapExchange exchange)
	{
	exchange.respond("temperature"+(i++));

	}
	public static void main(String agrs[])
	{
	CoapServer c=new CoapServer();
	c.add(new server_main("humidity"));
	c.start();
	}
	}
	
	
	
	
