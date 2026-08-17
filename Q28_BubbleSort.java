// Q28: Bubble sort - ordering spectrometer readings by wavelength
public class Q28_BubbleSort {
    public static void main(String[] args) {
        double[] wavelengthsNm = {650.2, 405.1, 532.0, 780.4, 488.3};
        System.out.println("Unsorted spectrometer wavelengths: " + java.util.Arrays.toString(wavelengthsNm));

        for (int i = 0; i < wavelengthsNm.length - 1; i++) {
            for (int j = 0; j < wavelengthsNm.length - 1 - i; j++) {
                if (wavelengthsNm[j] > wavelengthsNm[j + 1]) {
                    double temp = wavelengthsNm[j];
                    wavelengthsNm[j] = wavelengthsNm[j + 1];
                    wavelengthsNm[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted wavelengths: " + java.util.Arrays.toString(wavelengthsNm));
    }
}
