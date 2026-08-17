// Q11: StringBuilder for efficient string building - assembling G-code for a CNC toolpath
public class Q11_StringBuilderCNC {
    public static void main(String[] args) {
        double[][] toolPath = {
            {0, 0, 5},
            {10, 0, -2},
            {10, 10, -2},
            {0, 10, -2},
            {0, 0, 5}
        };

        StringBuilder gcode = new StringBuilder();
        gcode.append("G21 ; units in mm\n");
        gcode.append("G90 ; absolute positioning\n");

        int lineNumber = 10;
        for (double[] point : toolPath) {
            gcode.append("N").append(lineNumber)
                 .append(" G01 X").append(point[0])
                 .append(" Y").append(point[1])
                 .append(" Z").append(point[2])
                 .append(" F300\n");
            lineNumber += 10;
        }
        gcode.append("M30 ; end of program");

        System.out.println(gcode);
        System.out.println("Total G-code length: " + gcode.length() + " characters");
    }
}
