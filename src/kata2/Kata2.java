package kata2;

public class Kata2 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(new DataObjet('a'), new DataObjet('a'), new DataObjet('e'), new DataObjet('c'), new DataObjet('b'), new DataObjet('c'));
        histogram.add(new DataObjet(9));
        histogram.add(new DataObjet(9));
        histogram.add(new DataObjet("esto va"));
        HistogramDisplay histogramDisplay = new HistogramConsoleDisplay();
        histogramDisplay.show(histogram);
        
    }
    
}
