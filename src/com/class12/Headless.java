package com.class12;

import java.util.HashSet;
import java.util.Set;

public class Headless {

	public static void main(String[] args) {
		 // Declaring and initialising the HtmlUnitWebDriver
String str = "cat cat dog bear fox dog ";
        
        String[] split = str.split(" ");
        
        
        Set<String> set = new HashSet<>();
        for(String sp: split) {
            if(set.add(sp) == false) {
                System.out.println(sp);
            }
        }
        
        
    }
	}

