package com.syntax.class11;

public class Phone {
	
	String model;
	String make;
	double ScreenSize;
	int RAM;
	int ROM;
	int storage;
	int camera;
	void call(){
	System.out.println("CAlling someone");}
	void takePictures() {
		System.out.println("use my camera");}
	
	
	
	
	
	public static void main(String[] args) {
		Phone s22ultra=new Phone();
		s22ultra.make="Samsung";
		s22ultra.model="Galaxy";
		s22ultra.RAM=12;
		s22ultra.ScreenSize=6.8;
		s22ultra.storage=512;
		s22ultra.camera=108;
		System.out.println(s22ultra.storage);
		s22ultra.call();
		
		
	
	}
	
	
	
	
	
}

