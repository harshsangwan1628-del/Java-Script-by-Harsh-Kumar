// Q36: Operator precedence - computing electrical power correctly vs. a misgrouped formula
public class Q36_OperatorPrecedence {
    public static void main(String[] args) {
        double voltage = 12.0, current = 2.0, resistance = 3.0;

        // * binds tighter than +, so this correctly computes P = V*I + I^2*R
        double powerCorrect = voltage * current + resistance * current * current;
        // Parentheses change the grouping entirely, producing a different result
        double powerMisgrouped = voltage * (current + resistance) * current;

        System.out.println("P = V*I + R*I*I   = " + powerCorrect + " W (intended formula)");
        System.out.println("V*(I+R)*I         = " + powerMisgrouped + " W (wrong grouping changes the result)");

        int a = 5, b = 2, c = 3;
        int result = a + b * c - (a % b); // multiplication before addition, modulo evaluated inside parentheses first
        System.out.println("a + b*c - (a%b)   = " + result);
    }
}
