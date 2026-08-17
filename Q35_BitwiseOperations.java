// Q35: Bitwise operations - managing an ECU fault flag register with individual bit flags
public class Q35_BitwiseOperations {
    public static void main(String[] args) {
        int faultRegister = 0b0000;
        final int OVER_TEMP = 1 << 0;
        final int LOW_OIL_PRESSURE = 1 << 1;
        final int SENSOR_FAULT = 1 << 2;

        faultRegister |= OVER_TEMP;    // set the over-temp flag
        faultRegister |= SENSOR_FAULT; // set the sensor fault flag

        System.out.println("Fault register: " + Integer.toBinaryString(faultRegister));
        System.out.println("Over-temp active? " + ((faultRegister & OVER_TEMP) != 0));
        System.out.println("Low oil pressure active? " + ((faultRegister & LOW_OIL_PRESSURE) != 0));

        faultRegister &= ~OVER_TEMP; // clear the over-temp flag after cooldown
        System.out.println("After clearing over-temp: " + Integer.toBinaryString(faultRegister));

        int shifted = faultRegister << 2;
        System.out.println("Register shifted left by 2 (priority encoding): " + Integer.toBinaryString(shifted));
    }
}
