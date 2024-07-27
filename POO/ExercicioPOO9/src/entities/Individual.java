package entities;

public class Individual extends TaxPayer{
    private Double healthExpanditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpanditures) {
        super(name, anualIncome);
        this.healthExpanditures = healthExpanditures;
    }

    public Double getHealthExpanditures() {
        return healthExpanditures;
    }

    public void setHealthExpanditures(Double healthExpanditures) {
        this.healthExpanditures = healthExpanditures;
    }

    @Override
    public double tax(){
        if(healthExpanditures > 0) {
            if (anualIncome < 20000) {
                return anualIncome * 0.15 - (healthExpanditures * 0.5);
            } else {
                return anualIncome * 0.25 - (healthExpanditures * 0.5);
            }
        } else {
            if (anualIncome < 20000) {
                return anualIncome * 0.15;
            } else {
                return anualIncome * 0.25;
            }
        }
    }
}
