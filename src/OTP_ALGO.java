@FunctionalInterface
public interface OTP_ALGO {
	
	public byte[] encrypt(byte[] byte_secret, byte[] byte_string);
	
}

