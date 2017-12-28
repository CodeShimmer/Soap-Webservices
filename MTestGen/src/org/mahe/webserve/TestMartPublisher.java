/**
 * 
 */
package org.mahe.webserve;

import javax.xml.ws.Endpoint;

/**
 * @author jonna
 *
 */
public class TestMartPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:1234/ProductCatalog", new ProductCatalog());

	}

}
