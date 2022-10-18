package Factors;

/**
 * Hauptprogramm f�r die Berechnung aller Teiler einer angegebenen Zahl.
 */
public class FactorsMain {

	public static void main(String[] args) {
		
		Long number = (long)42;
		ComputeFactors factors = new ComputeFactors(number);
//		factors.computeFactor();
		factors.computeFactorOptimize();

		System.out.println(factors);
	}
}
