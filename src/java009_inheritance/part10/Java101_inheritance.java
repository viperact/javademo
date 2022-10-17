package java009_inheritance.part10;
/*
 * 
 * import java.lang.System;
 * import java.lang.String;
 * 
 * JVM에서 기본적으로 제공되는 import (기본적인 코어들)
 * - 별도로 import를 안해도 기본적으로 경로를 잡아준다.
 */


public class Java101_inheritance {
	
	 public static void main(String[] args) {
		BasicTv btv = new BasicTv();
		btv.isPowerOn = true;
		btv.channel = 8;
		btv.volume = 10;
		btv.display();
		
		System.out.println("***************************");
		SmartTv stv = new SmartTv();
		stv.isPowerOn = true;
		stv.channel = 10;
		stv.volume =15;
		stv.ip = "192.68.24.1";
		stv.display();
	}
}
