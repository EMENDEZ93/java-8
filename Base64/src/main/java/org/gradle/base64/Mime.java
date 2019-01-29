package org.gradle.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Mime {

	public static void main(String... args) throws UnsupportedEncodingException {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < 10; ++i) {
			stringBuilder.append(UUID.randomUUID().toString());
		}
		
		byte[] mimes = stringBuilder.toString().getBytes("utf-8");

		String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimes);
		System.out.println(mimeEncodedString);	
	
	}
	
	
}
