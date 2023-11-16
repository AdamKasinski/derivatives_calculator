package derivatives;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bond")
public class Bond{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private double notional;
    private double interestRate;
    private int frequency;

    public Bond(){}

    public Bond(String id, double notional, double interestRate, int frequency){
        this.id = id;
        this.notional = notional;
        this.interestRate = interestRate;
        this.frequency = frequency;
    }

    public String getId(){
        return this.id;
    }

    public double getNotional(){
        return this.notional;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public int getFrequency(){
        return this.frequency;
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