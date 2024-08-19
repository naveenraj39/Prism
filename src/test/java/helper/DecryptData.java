package helper;

import java.util.Base64;

public class DecryptData {
	
	protected String decrypt(String Udecrpt) {
		byte[] decode = Base64.getDecoder().decode(Udecrpt);
		return (new String(decode));
	}
	
	protected String decryptp(String Pdecrpt) {
		byte[] decode1 = Base64.getDecoder().decode(Pdecrpt);
		return (new String(decode1));
	}
	

}
