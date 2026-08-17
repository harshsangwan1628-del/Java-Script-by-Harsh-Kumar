// Q33: == vs .equals() for strings - matching a scanned part number against a catalog entry
public class Q33_StringEqualsVsDoubleEquals {
    public static void main(String[] args) {
        String partFromCatalog = "PN-4471-A";
        String partFromScanner = new String("PN-4471-A"); // forces a distinct object, not pooled
        String partFromLiteralPool = "PN-4471-A";

        System.out.println("catalog == scanner (reference check): " + (partFromCatalog == partFromScanner));
        System.out.println("catalog == literalPool (reference check): " + (partFromCatalog == partFromLiteralPool));
        System.out.println("catalog.equals(scanner) (content check): " + partFromCatalog.equals(partFromScanner));
    }
}
