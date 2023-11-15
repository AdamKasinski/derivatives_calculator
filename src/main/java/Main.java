package src.main.java;
import java.time.LocalDate;

import src.main.java.derivatives.Bond;

public class Main {
    public static void main(String[] args) {
        Bond bond = new Bond("bond1", 100.0, 
                            0.02, 4, 
                            LocalDate.of(2023,2,20), 
                            LocalDate.of(2027,2,20));
        System.out.println(bond.valuate(LocalDate.of(2023,2,20)));
    }
}
