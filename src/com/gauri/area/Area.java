package com.gauri.area;

import java.util.Scanner;

public class Area {
	int length;
	int breadth;

	void setDim(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int getArea() {
		int area;
		area=length*breadth;
		return area;
	}

	public static void main(String args[]) {
		Area a1 = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Reactangle length: ");
		int len = sc.nextInt();
		System.out.print("Enter Reactangle breadth: ");
		int bred = sc.nextInt();
		a1.setDim(len, bred);
		int ans=a1.getArea();
		System.out.println("Area of Reactangle: "+ans);
	}
}
