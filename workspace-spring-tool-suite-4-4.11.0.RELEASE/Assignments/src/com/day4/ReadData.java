package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {
	
public static String acceptString() {
String stringData = null;
BufferedReader input = null;
try {
	input = new BufferedReader(new InputStreamReader(System.in));
}
catch(IOException ioException){
System.out.println("Error in accepting data.");
}
finally {
input=null;
}
}
}



