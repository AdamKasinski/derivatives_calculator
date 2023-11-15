package derivatives;

import java.time.LocalDate;

public class Bond{
    
    private String id;
    private double notional;
    private double interestRate;
    private int frequency;
    private LocalDate startDate;
    private LocalDate endDate;

    public Bond(String id, double notional, double interestRate, int frequency, LocalDate startDate, LocalDate endDate){
        this.id = id;
        this.notional = notional;
        this.interestRate = interestRate;
        this.frequency = frequency;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double valuate(LocalDate valuationDate){
        double price = 0;
        int numberOfPeriods = 4;
        for (int i=0; i < numberOfPeriods-1; i++){
            price += this.notional*this.interestRate;
        }
        return price + this.notional+this.notional*this.interestRate; 
    }

}