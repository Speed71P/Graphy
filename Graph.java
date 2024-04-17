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
    }

    // function to be graphed
    private int f(int x) {
        return 5; // equation x = 5
    }
}