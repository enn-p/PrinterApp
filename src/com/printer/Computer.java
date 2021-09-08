package com.printer;

import java.util.Scanner;

import com.vowsonant.Vowsonant;

public class Computer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		Vowsonant.VowelConsonant(name);

	}

}
