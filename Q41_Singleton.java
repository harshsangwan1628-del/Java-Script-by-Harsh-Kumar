// Q41: Singleton - a single shared power grid controller instance for the whole application
public class Q41_Singleton {
    public static void main(String[] args) {
        PowerGridController grid1 = PowerGridController.getInstance();
        PowerGridController grid2 = PowerGridController.getInstance();

        grid1.setLoadMw(450);
        System.out.println("grid2 sees load set through grid1: " + grid2.getLoadMw());
        System.out.println("Same instance? " + (grid1 == grid2));
    }
}

class PowerGridController {
    private static PowerGridController instance;
    private double loadMw;

    private PowerGridController() {
        // private constructor prevents external instantiation
    }

    public static PowerGridController getInstance() {
        if (instance == null) {
            instance = new PowerGridController();
        }
        return instance;
    }

    public void setLoadMw(double loadMw) {
        this.loadMw = loadMw;
    }

    public double getLoadMw() {
        return loadMw;
    }
}
