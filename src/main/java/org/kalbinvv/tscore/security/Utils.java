package org.kalbinvv.tscore.security;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {

	public static String convertToSHA256(String originalString){
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
		StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
	    for (int i = 0; i < encodedhash.length; i++) {
	        String hex = Integer.toHexString(0xff & encodedhash[i]);
	        if(hex.length() == 1) {
	            hexString.append('0');
	        }
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}
	
}
