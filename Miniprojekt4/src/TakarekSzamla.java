public class TakarekSzamla extends RegularisSzamla {
    private double kamatRata;

    public TakarekSzamla(String tulajdonosNev, double kamatRata) {
        super(tulajdonosNev);
        this.kamatRata = kamatRata;
    }

    public void hozzaadKamat() {
        double kamat = this.getEgyenleg() * this.kamatRata / 100;
        this.betesz(kamat);
    }


    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TakarekSzamla) {
            TakarekSzamla other = (TakarekSzamla) obj;
            return this.tulajdonosNev.equals(other.tulajdonosNev)
                    && this.szamlaszam == other.szamlaszam
                    && this.kamatRata == other.kamatRata;
        }
        return false;
    }
}
