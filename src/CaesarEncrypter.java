
public class CaesarEncrypter implements Encrypter {
	private int offset;
	private String alphabet = "abcdefghijklmnopqrstuvwxyz .,!?";
	
	public CaesarEncrypter(int offset) {
		this.offset = offset;
	}
	
	public String encrypt(String message) {
		return this.process(message);
	}
	
	public String decrypt(String message) {
		this.offset = this.alphabet.length() - this.offset;
		return this.process(message);
	}
	
	public String process(String message) {
        StringBuilder processedMessage = new StringBuilder(message);
        String alphabetSearch = this.alphabet.substring(this.offset) + this.alphabet.substring(0, this.offset);

        for(int i = 0; i < processedMessage.length(); i++) {
            char currChar = processedMessage.charAt(i);

            if(this.alphabet.indexOf(currChar) != -1) {
                int idx = this.alphabet.indexOf(currChar);
                char newChar = alphabetSearch.charAt(idx);
                
                processedMessage.setCharAt(i, newChar);
            }
        }

        return processedMessage.toString();
	}

}
