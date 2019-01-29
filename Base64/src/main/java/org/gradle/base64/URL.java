package org.gradle.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class URL {

	public static void main(String... args) throws UnsupportedEncodingException {

		String originalUrl = "www.edwin-mendez.com";
	
		System.out.println("*************** Encoder ***************+");
		String base64encodedString = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes("utf-8"));
		System.out.println(base64encodedString);
				 
		System.out.println("**************** Decoder *****************");
		byte[] base64decodedBytes = Base64.getUrlDecoder().decode(base64encodedString);
		System.out.println(new String(base64decodedBytes, "utf-8"));
		
				
	}

}
