// Q14: if-else, switch, and for loops - simulating a traffic light controller cycle
public class Q14_ControlStatements {
    public static void main(String[] args) {
        String[] cycle = {"RED", "GREEN", "YELLOW"};

        for (int cycleCount = 1; cycleCount <= 2; cycleCount++) {
            System.out.println("--- Cycle " + cycleCount + " ---");
            for (String light : cycle) {
                String action;
                switch (light) {
                    case "RED":
                        action = "Stop";
                        break;
                    case "GREEN":
                        action = "Go";
                        break;
                    case "YELLOW":
                        action = "Prepare to stop";
                        break;
                    default:
                        action = "Unknown signal";
                }
                System.out.println(light + " -> " + action);

                if (light.equals("RED")) {
                    System.out.println("  Pedestrian crossing is safe");
                } else if (light.equals("YELLOW")) {
                    System.out.println("  Pedestrian crossing closing soon");
                } else {
                    System.out.println("  Pedestrian crossing is NOT safe");
                }
            }
        }
    }
}
