// Q12: String immutability - editing a "firmware version" string never mutates the original object
public class Q12_StringImmutability {
    public static void main(String[] args) {
        String firmwareVersion = "FW-2.4.1";
        String reference = firmwareVersion;

        System.out.println("Before update: " + firmwareVersion);
        firmwareVersion = firmwareVersion.replace("2.4.1", "2.5.0"); // creates a brand new String object
        System.out.println("After update:  " + firmwareVersion);
        System.out.println("Reference still points to the original: " + reference);

        System.out.println("Same object as reference? " + (firmwareVersion == reference));

        String pooledLiteral = "FW-2.5.0";
        System.out.println("Same object as an equal literal? " + (firmwareVersion == pooledLiteral));
        System.out.println("Equal by content (.equals)? " + firmwareVersion.equals(pooledLiteral));
    }
}
