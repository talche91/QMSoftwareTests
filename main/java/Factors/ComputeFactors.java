package Factors;

import java.util.ArrayList;

/**
 * Berechnung aller Teiler einer ganzen Zahl. 
 *
 * Aufgabenstellung
 */
public class ComputeFactors {

    private Long number;
    private ArrayList<Long> factors;

    /**
     * standard constructor with number 2
     * */
    public ComputeFactors() {
        this.number = (long) 2;
        this.factors = new ArrayList<Long>();
    }

    /**
     * constructor with given number
     * */
    public ComputeFactors(Long number) {
        this.number = number;
        this.factors = new ArrayList<Long>();
    }

    /**
     * gets the arraylist of factors
     * @return factors
     */
    public ArrayList<Long> getFactors() {
        return factors;
    }

    public void computeFactor() {
        Long factor = (long) 2;

        while (factor <= this.number - 1) {
            if (this.number % factor == 0) {
                // the value is a factor
                this.factors.add(factor);
            }
            factor++;
        }
    }

    /**
     * to optimize the method:
     * less looping
     */
    public void computeFactorOptimize() {
        Long factor = (long) 2;
        int count = 0;

        for (int i = 2; i <= this.number / 2; i++) {
            if (this.number % i == 0) {
                this.factors.add((long) i);
            }
            count++;
        }

        System.out.println("schleifendurchläufe: " + count);
    }

    @Override
    public String toString() {
        String text = "";
        text = "Die Teiler der Zahl " + this.number + ":\n";
        text += this.factors.toString();
        return text;
    }
}
