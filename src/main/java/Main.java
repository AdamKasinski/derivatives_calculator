import java.time.LocalDate;
import derivatives.Bond;

public class Main {
    public static void main(String[] args) {
        Bond bond = new Bond("bond1", 100.0, 
                            0.02, 4, 
                            LocalDate.of(2023,2,20), 
                            LocalDate.of(2027,2,20));
        System.out.println(bond.valuate(LocalDate.of(2023,2,20)));
    }
}