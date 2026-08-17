// Q45: final class and final method - a cryptographic key type and its non-overridable verification logic
public class Q45_FinalClassAndMethod {
    public static void main(String[] args) {
        CryptographicKey key = new CryptographicKey("MASTER-SECRET-001");
        String fingerprint = key.fingerprint();
        System.out.println("Key fingerprint: " + fingerprint);

        Authenticator auth = new Authenticator();
        System.out.println("Verify correct key: " + auth.verify("MASTER-SECRET-001", fingerprint));
        System.out.println("Verify tampered key: " + auth.verify("MASTER-SECRET-002", fingerprint));
    }
}

final class CryptographicKey { // final class: this security-sensitive type cannot be subclassed
    private final String keyMaterial;

    CryptographicKey(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    String fingerprint() {
        return "SHA256:" + Integer.toHexString(keyMaterial.hashCode());
    }
}

class Authenticator {
    final boolean verify(String presented, String expectedFingerprint) { // final: verification cannot be weakened by a subclass
        String actual = new CryptographicKey(presented).fingerprint();
        return actual.equals(expectedFingerprint);
    }
}
