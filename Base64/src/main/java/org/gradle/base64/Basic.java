package org.gradle.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Basic {

	public static void main(String... args) throws UnsupportedEncodingException {
		
		String original = "Ceiba Software House";
		
		System.out.println("***************** Encoder *******************");
		String base64encodedString = Base64.getEncoder().encodeToString(original.getBytes("utf-8"));
		System.out.println(base64encodedString);
	
		System.out.println("***************** Decoder ******************");
		byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
		System.out.println(new String(base64decodedBytes, "utf-8"));
		
	}
	
}
