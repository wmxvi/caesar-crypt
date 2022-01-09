
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "samstag party bei mir. aber sagt brutus nichts davon!";
		
		System.out.println(str);
		System.out.println();
		
		CaesarEncrypter e = new CaesarEncrypter(15);
		String encrypt = e.encrypt(str);
		
		System.out.println(encrypt);
		
		String decrypt = e.decrypt(encrypt);
		System.out.println(decrypt);
	}

}
