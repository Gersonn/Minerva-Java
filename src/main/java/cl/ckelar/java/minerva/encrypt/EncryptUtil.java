package cl.ckelar.java.minerva.encrypt;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Funciones de encriptación de datos
 * 
 * @author Gerson Díaz
 * @version 1.0.0
 * 
 * Creado el 24/04/2018
 * 
 * **/
public class EncryptUtil {

	/**
	 * Función que permite encriptar una cadena de texto con SHA-512
	 * 
	 * @author Gerson Díaz
	 * @param data Cadena de texto a encriptar
	 * @return Cadena de texto encriptada en SHA-512 o vacío si hay algún error
	 * **/
	public static String encryptSHA512(String data) {
		
		String result = "";
		
		try {
			
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			byte[] byteSHA = digest.digest(data.getBytes());
			
			BigInteger intNumber = new BigInteger(1, byteSHA);
			String hashCode = intNumber.toString(16);
			
			while (hashCode.length() < 128) {
	            hashCode = "0" + hashCode;
	        }
			
			result = hashCode;
			
		} catch(NoSuchAlgorithmException e) {
			result = "";
		}
		
		return result;
		
	}
	
}
