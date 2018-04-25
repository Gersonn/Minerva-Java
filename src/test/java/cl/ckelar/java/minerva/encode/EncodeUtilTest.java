package cl.ckelar.java.minerva.encode;

import org.junit.Test;

public class EncodeUtilTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		String text = "Esta es un texto de pruebas";
		String b64Encode = EncodeUtil.encodeToBase64(text);
		String b64Decode = EncodeUtil.dencodeFromBase64(b64Encode);
		
		org.junit.Assert.assertTrue(!b64Encode.isEmpty());
		org.junit.Assert.assertTrue(!b64Decode.isEmpty());
		
	}

}
