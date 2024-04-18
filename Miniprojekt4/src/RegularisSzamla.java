import java.util.ArrayList;
import java.util.List;

public class RegularisSzamla implements Bankszamla.BankSzamla {
    private static int kovSzamlaSzam = 1;
    protected int szamlaszam;
    protected double egyenleg;
    protected String tulajdonosNev;
    public List<Tranzakcio> tranzakciok = new ArrayList<>();

    public RegularisSzamla(String tulajdonosNev) {
        this.szamlaszam = ujSzamlaSzam();
        this.tulajdonosNev = tulajdonosNev;
        this.egyenleg = 0;
    }

    private static int ujSzamlaSzam() {
        return ++kovSzamlaSzam;
    }

    @Override
    public void betesz(double osszeg) {
        this.egyenleg += osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
    }

    @Override
    public void kivesz(double osszeg) throws NincsElegendoOsszegException {
        if (osszeg > this.egyenleg) {
            throw new NincsElegendoOsszegException("Nincs elegendő összeg a számlán!");
        }
        this.egyenleg -= osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg));
    }

    @Override
    public double getEgyenleg() {
        return this.egyenleg;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Számlaszám: ").append(szamlaszam).append(", Tulajdonos neve: ").append(tulajdonosNev)
                .append(", Egyenleg: ").append(egyenleg).append("\nTranzakciók:\n");
        for (Tranzakcio tranzakcio : tranzakciok) {
            builder.append(tranzakcio.toString()).append("\n");
        }
        return builder.toString();
    }
}
