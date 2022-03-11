package com.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTester {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtill dt = DateUtill.getInstance();
		ObjectOutputStream ot = new ObjectOutputStream(new FileOutputStream(new File("D:\\EclipseWorkspaces\\Personnel\\DesignPatternsUdemy\\SingletonExtra\\ot.txt")));
		ot.writeObject(dt);
		
		
		DateUtill dt1 = DateUtill.getInstance();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\\\EclipseWorkspaces\\\\Personnel\\\\DesignPatternsUdemy\\\\SingletonExtra\\\\ot.txt")));
		dt1 = (DateUtill)ois.readObject();
		
		ot.close();
		ois.close();
		
		System.out.println(dt == dt1);
		
		MyLogger log = MyLogger.getInstance();
		
		log.log("chanaka");
	}

}
