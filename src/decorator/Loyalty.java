package decorator;

public enum Loyalty {
    Regular(0.9),
    VIP(0.85),
    Military(0.8);
    public final double discount;

    private Loyalty(double discount) {
        this.discount = discount;
    }
}
