package com.gauri.area;

import java.util.Scanner;

public class Reactangle {
	int length;
	int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public Reactangle() {
		// TODO Auto-generated constructor stub
	}

	public Reactangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int diameater(int length, int breadth) {
		int temp;
		temp = length * breadth;
		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reactangle r1=new Reactangle(); 
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter length: ");
		int len=sc.nextInt();
		
	}

}
