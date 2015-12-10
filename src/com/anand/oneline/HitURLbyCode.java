package com.anand.oneline;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HitURLbyCode {


	public static void main(String[] args) throws IOException {
		URL url= new URL("https://www.google.co.in/");
		URLConnection urlconnection=url.openConnection();
		urlconnection.connect();
		
		

	}

}
