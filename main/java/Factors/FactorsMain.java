package Factors;

/**
 * Hauptprogramm für die Berechnung aller Teiler einer angegebenen Zahl.
 */
public class FactorsMain {

	public static void main(String[] args) {
		
		Long number = (long)-42;
		ComputeFactors factors = new ComputeFactors(number);
		ComputeFactors factorsWithOptimize1 = new ComputeFactors(number);
		factors.computeFactor();
		factorsWithOptimize1.computeFactorOptimize();

		System.out.println(factors);
		System.out.println(factorsWithOptimize1);
	}
}
