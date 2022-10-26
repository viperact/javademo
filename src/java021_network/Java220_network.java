package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java220_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
			System.out.println("getHost():" + url.getHost()); // movie.daum.net
			System.out.println("getProtocol():" + url.getProtocol()); // https
			System.out.println("getPort():" + url.getPort()); // -1 (지정해둔값이 없을때 기본값)
			System.out.println("getPath():" + url.getPath()); // moviedb/main
			System.out.println("getQuery():" + url.getQuery()); //movieId=3212
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
