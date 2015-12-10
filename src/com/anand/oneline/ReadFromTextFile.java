package com.anand.oneline;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("notepad.txt"));
		
		StringBuilder sd= new StringBuilder();
		String line=br.readLine();
		
		while(line!=null){
			sd.append(line);
			sd.append(System.lineSeparator());
			line=br.readLine();
		}

		String all=sd.toString();
		System.out.println("....reading from file: "+all);
	}

}
