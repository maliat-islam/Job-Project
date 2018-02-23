package com.pro.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
	
	public void doesFileExist(String path) {
		File f = new File(path);
		if(!f.exists()) {
			try {
				throw new FileNotFoundException("File not found.");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	@SuppressWarnings("resource")
	public void FileRead(String path)  {
		Scanner sc = new Scanner(System.in);
		File f = new File(path);
		
			try {
				sc = new Scanner(f);
			
			
			while(sc.hasNextLine()) {
				String text =sc.nextLine();
				String [] text1 = text.split("[–,]");
				for(String text2:text1) {
					System.out.println(text2);
				}
			}
			sc.close();
		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
