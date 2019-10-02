package kata.pkg2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(4,3,8,1,5,5,7,5,1,2,3,2,1,7,0);
        HistogramDisplay display= new HistogramDisplay(histogram);
        display.execute();
    }
    
}
