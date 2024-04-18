public class Bankszamla {

    // BankSzamla interfész
    interface BankSzamla {
        void betesz(double osszeg);
        void kivesz(double osszeg) throws NincsElegendoOsszegException;
        double getEgyenleg();
    }
}


