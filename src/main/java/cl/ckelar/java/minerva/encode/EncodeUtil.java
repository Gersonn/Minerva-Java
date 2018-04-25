package cl.ckelar.java.minerva.encode;

import java.util.Base64;

/**
 * Funciones de codificación de datos
 * 
 * @author Gerson Díaz
 * @version 1.0.0
 * 
 * Creado el 24/04/018
 * **/
public class EncodeUtil {

	/**
	 * Codifica una cadena de texto en base64
	 * 
	 * @author Gerson Díaz
	 * @param data Cadena de texto a codificar
	 * @return Retorna una cadena de texto codificada en base64
	 * **/
	public static String encodeToBase64(String data) {
		
		String resp = "";
		
		try {
			
			if (data.isEmpty()) {
				return "";
			}
			
			byte[] encode = Base64.getEncoder().encode(data.getBytes());
			
			resp = new String(encode);
			
		} catch (Exception e) {
			resp = "";
		}
		
		return resp;
		
	}
	
	/**
	 * Decodifica una cadena de texto desde base64
	 * 
	 * @author Gerson Díaz
	 * @param data Cadena de texto a decodificar
	 * @return Retorna una cadena de texto decodificada desde base64
	 * **/
	public static String dencodeFromBase64(String data) {
		
		String resp = "";
		
		try {
			
			if (data.isEmpty()) {
				return "";
			}
			
			byte[] decode = Base64.getDecoder().decode(data.getBytes());
			
			resp = new String(decode);
			
		} catch (Exception e) {
			resp = "";
		}
		
		return resp;
		
	}
	
	
}
