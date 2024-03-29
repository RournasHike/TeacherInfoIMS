package com.mytest.teainfoims.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Base64;

/**
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 */
public class UserBase64 {


	/**
	 * userID解密
	 * @param encodedUserID
	 * @return
	 */
	public static Integer decoderUserID(String encodedUserID)  {
		if (StringUtils.isBlank(encodedUserID)) {
			return null;
		}
		try {
			String reversedString = new StringBuffer(encodedUserID).reverse().toString();
			String base64String = reversedString.replaceAll("#", "=");
			int userIDPos = base64String.indexOf("==") + 6;
			String realBase64UserID = base64String.substring(userIDPos);
			String base64Encoded = new String(Base64.getDecoder().decode(realBase64UserID.getBytes()));
			return Integer.parseInt(base64Encoded);
		} catch (Exception e) {
			return null;
		}
	}


	/**
	 * 用户id加密
	 * @param userID
	 * @return
	 */
	public static String encoderUserID(Integer userID){
		String base64UserIDEncoded = Base64.getEncoder().encodeToString((userID + "").getBytes());
		String currentStringBase64Encoded = Base64.getEncoder().encodeToString((System.currentTimeMillis() + "").getBytes());
		String keyString = currentStringBase64Encoded  
				+ currentStringBase64Encoded.substring(4, 8) + base64UserIDEncoded;
		byte[] codeBytes = keyString.getBytes();
		byte[] ordedBytes = new byte[codeBytes.length];
		for(int i=0; i<codeBytes.length; i++){
			ordedBytes[i] = codeBytes[codeBytes.length-i-1];
		}
		return new String(ordedBytes).replaceAll("=", "#");
	}

	public static String decoderUserName(String encodedUserName)  {
		if (StringUtils.isBlank(encodedUserName)) {
			return null;
		}
		try {
			String reversedString = new StringBuffer(encodedUserName).reverse().toString();
			String base64String = reversedString.replaceAll("#", "=");
			int userIDPos = base64String.indexOf("==") + 6;
			String realBase64UserID = base64String.substring(userIDPos);
			String base64Encoded = new String(Base64.getDecoder().decode(realBase64UserID.getBytes()));
			return base64Encoded;
		} catch (Exception e) {
			return null;
		}
	}

	public static String encoderUserName(String userName){
		String base64UserIDEncoded = Base64.getEncoder().encodeToString((userName + "").getBytes());
		String currentStringBase64Encoded = Base64.getEncoder().encodeToString((System.currentTimeMillis() + "").getBytes());
		String keyString = currentStringBase64Encoded
				+ currentStringBase64Encoded.substring(4, 8) + base64UserIDEncoded;
		byte[] codeBytes = keyString.getBytes();
		byte[] ordedBytes = new byte[codeBytes.length];
		for(int i=0; i<codeBytes.length; i++){
			ordedBytes[i] = codeBytes[codeBytes.length-i-1];
		}
		return new String(ordedBytes).replaceAll("=", "#");
	}

	public static void main(String[] args) {
		System.out.println(encoderUserID(20));
		System.out.println(decoderUserID("#AjMzgjM##QN1AjN4gTOzgjM3UTM"));

		System.out.println(encoderUserName("000118"));
		System.out.println(decoderUserName("4ETMwADM3QTM##AO4kTMzEjN3QTMxYTM"));
	}
}