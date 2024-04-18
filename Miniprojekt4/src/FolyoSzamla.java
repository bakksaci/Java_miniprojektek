public class FolyoSzamla extends RegularisSzamla {
    private int tranzakciokSzama;
    private static final int INGYENESTRANZAKCIOKSZAMA = 3;
    private static final double TRANZAKCIOARA = 2.0;

    public FolyoSzamla(String tulajdonosNev) {
        super(tulajdonosNev);
    }

    @Override
    public void betesz(double osszeg) {
        tranzakciokSzama++;
        super.betesz(osszeg);
    }

    @Override
    public void kivesz(double osszeg) throws NincsElegendoOsszegException {
        tranzakciokSzama++;
        super.kivesz(osszeg);
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > INGYENESTRANZAKCIOKSZAMA) {
            double levonando = TRANZAKCIOARA * (tranzakciokSzama - INGYENESTRANZAKCIOKSZAMA);
            try {
                super.kivesz(levonando);
            } catch (NincsElegendoOsszegException e) {
                System.out.println("Hiba a költség levonásakor: " + e.getMessage());
            }
            tranzakciokSzama = 0;
        }
    }

    public int getTranzakciokSzama() {
        return tranzakciokSzama;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FolyoSzamla) {
            FolyoSzamla other = (FolyoSzamla) obj;
            return this.tulajdonosNev.equals(other.tulajdonosNev)
                    && this.szamlaszam == other.szamlaszam
                    && this.tranzakciokSzama == other.tranzakciokSzama;
        }
        return false;
    }
}
