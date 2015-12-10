package com.anand.oneline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
// trying to hit google.com and print response
public class HitURLbyCode {


	public static void main(String[] args) throws IOException {
		String s="NITP";
		
		URL url= new URL("https://www.google.co.in/");
		URLConnection urlconnection=url.openConnection();
		//urlconnection.connect();
		urlconnection.setDoOutput(true);
		
		OutputStream out=urlconnection.getOutputStream();
		out.write(s.getBytes());
		//out.write(13);
		out.close();
		
		BufferedReader in=new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
		String wr;
		while((wr=in.readLine())!=null){
			
			System.out.println(wr);
		}
		in.close();
		
		

	}

}
