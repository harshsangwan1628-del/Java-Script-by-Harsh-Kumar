// Q50: Palindrome check for a string - identifying restriction-enzyme palindromic DNA sequences
public class Q50_PalindromeGeneSequence {
    public static void main(String[] args) {
        String[] candidateSites = {"GAATTC", "GGATCC", "GAATTG"};
        for (String site : candidateSites) {
            System.out.println(site + " is a restriction-site palindrome? " + isReverseComplementPalindrome(site));
        }
    }

    static boolean isReverseComplementPalindrome(String sequence) {
        return sequence.equals(reverseComplement(sequence));
    }

    static String reverseComplement(String sequence) {
        StringBuilder result = new StringBuilder();
        for (int i = sequence.length() - 1; i >= 0; i--) {
            result.append(complement(sequence.charAt(i)));
        }
        return result.toString();
    }

    static char complement(char base) {
        switch (base) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
            default: return base;
        }
    }
}
