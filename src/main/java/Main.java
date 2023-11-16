import java.util.List;

import dbConnector.BondManager;
import dbConnector.HibernateUtil;
import derivatives.Bond;

public class Main {
    public static void main(String[] args) {

        BondManager bondManager = new BondManager();


        String bondId = "bond1";
        List<Bond> bonds = bondManager.getBondById(bondId);

        for ( Bond bond : bonds) {
            System.out.println( "Bond " + bond.getId() + " " + bond.getNotional() + " " + bond.getInterestRate());}

        HibernateUtil.shutdown();
    }
}