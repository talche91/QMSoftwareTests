package DreamCar;

/**
 * Klasse für die Berechnung des Preises.
 *
 * Der Quelltext wurde angepasst. Die Parameter im Quelltext
 * aus Spillner et. al. auf Seite 46 wurden als Daten in der Klasse
 * realisiert. Die Aufrufliste der Funktion ist jetzt leer.
 *
 */
public class DreamCarWithoutBug {

    private double basePrice;
    private double specialPrice;
    private double extraPrice;
    private int extras;
    private double discount;

    public DreamCarWithoutBug(double basePrice, double specialPrice, double extraPrice, int extras, double discount) {
        this.basePrice = basePrice;
        this.specialPrice = specialPrice;
        this.extraPrice = extraPrice;
        this.extras = extras;
        this.discount = discount;
    }

    public double calculatePrice() {
        double addonDiscount;
        double result;

        if (extras >= 3 && extras < 5) {
            addonDiscount = 10;
        } else if (extras >= 5) {
            addonDiscount = 15;
        } else {
            addonDiscount = 0;
        }

        if (discount > addonDiscount) {
            addonDiscount = discount;
        }

        result = (basePrice / 100.0) * (100.0 - discount)
                + specialPrice
                + extraPrice / 100.0 * (100.0 - addonDiscount);

        return result;
    }
}
