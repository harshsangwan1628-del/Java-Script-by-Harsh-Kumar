// Q49: String immutability - reworking a manufacturing lot code without altering the original object
public class Q49_StringImmutabilityLotCode {
    public static void main(String[] args) {
        String lotCode = "LOT-2026-034";
        String archived = lotCode;

        System.out.println("Original lot code: " + lotCode);
        lotCode = lotCode.concat("-REWORK"); // produces a brand new String, does not mutate the original

        System.out.println("Updated lot code: " + lotCode);
        System.out.println("Archived reference unaffected: " + archived);
        System.out.println("Same object? " + (lotCode == archived));
    }
}
