// Q48: Character frequency count - counting nucleotide bases in a DNA sequence
public class Q48_CharacterFrequency {
    public static void main(String[] args) {
        String dnaSequence = "ATCGGCTATTACGGATCG";
        int[] counts = new int[128]; // indexed by ASCII value

        for (char c : dnaSequence.toCharArray()) {
            counts[c]++;
        }

        System.out.println("Nucleotide frequency in sequence: " + dnaSequence);
        char[] bases = {'A', 'T', 'C', 'G'};
        for (char base : bases) {
            System.out.println(base + ": " + counts[base]);
        }
    }
}
