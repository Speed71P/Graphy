import java.lang.Math;
public class Graph {
    private int xMin;
    private int xMax;
    private int yMin;
    private int yMax;

    public Graph(int xMin, int xMax, int yMin, int yMax) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;

        if (xMin > xMax) {
            System.out.println("Error. The minimum x value cannot be larger than the maximum x value.");
            System.exit(1);
        }
        
        if (yMin > yMax) {
            System.out.println("Error. The minimum y value cannot be larger than the maximum y value.");
            System.exit(1);
        }
    }

    // function to be graphed
    private int f(int x) {
        return 5; // equation x = 5
    }

    public boolean[] getYBand(int y) {
        boolean[] boolArray = new boolean[yMax - yMin];
        for (int i = 0; i < boolArray.length; i++) {
            boolArray[i] = false;
        }
        if (f(x) >= yMin && f(x) <= yMax) {
            boolArray[f(x) + Math.abs(yMin)] = true;
        }
        return boolArray;
    }

    // get attributes
    public int getXMin() {return xMin;}
    public int getXMax() {return xMax;}
    public int getYMin() {return yMin;}
    public int getYMax() {return yMax;}
}