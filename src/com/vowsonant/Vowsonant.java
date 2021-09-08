package com.vowsonant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.printer.Printer;

public class Vowsonant {
	
	public static void VowelConsonant(String name) {
		
		List<String> myList = new ArrayList<String>(Arrays.asList(name.split("")));
		
		List<String> vowels = new ArrayList<String>();
		List<String> vowelspresent = new ArrayList<String>();
		List<String> conpresent = new ArrayList<String>();
		vowels.addAll(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
		
		Integer con = 0;
		Integer vow = 0;
		
		for(String ch:myList) {
			if (vowels.contains(ch)) {
				vow += 1;
				vowelspresent.add(ch);
			}
			else {
				con += 1;
				conpresent.add(ch);	
			}
		}
		
	Printer.print("The number of vowels are:");
	Printer.print(vow.toString());
	Printer.print(vowelspresent.toString());
	Printer.print("The number of consonants are:");
	Printer.print(con.toString());
	Printer.print(conpresent.toString());
	Printer.print("");
	Printer.print(myList.toString());
		
	}
	

}
