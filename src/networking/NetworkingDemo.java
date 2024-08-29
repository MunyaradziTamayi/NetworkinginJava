package networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public  class NetworkingDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		 Scanner scan =new Scanner(System.in);
		 String url=scan.next();
		 
		 int length=url.length();
		 System.out.println("URL length:"+length);
		 
		 String domain=url.substring(length-4);
		 String subdomain=url.substring(0,3);
		// System.out.println("subDomain:"+subdomain);
		// System.out.println(domain);
		String dotComDomain=".com";
		String subDomainwww="www";
		
		if(dotComDomain.equals(domain) && (subDomainwww.equals(subdomain))  ) {
			System.out.println("good URL");
			
			InetAddress InetAddress= Inet4Address.getByName(url);

			 System.out.println("Address "+Arrays.toString(InetAddress.getAddress()));
			 System.out.println("Host Address"+ InetAddress.getHostAddress());
			 
			 System.out.println("Is a loopback" + InetAddress.isLoopbackAddress());
		}
		else
			System.out.println("Entered wrong Url");

		 
		

}
}
