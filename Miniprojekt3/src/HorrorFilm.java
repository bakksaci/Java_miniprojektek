public class HorrorFilm extends Film implements IKorhatar {
    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    public int Korhatar() {
        return this.korh;
    }

    public String getCim() {
        return super.getCim();
    }

    public void setCim(String cim) {
        super.setCim(cim);
    }

    public int getAr() {
        return super.getAr();
    }

    public void setAr(int ar) {
        super.setAr(ar);
    }

    public int Buntetes(int kor) {
        int diff = kor - this.korh;
        return diff < 0 ? Math.abs(diff) * this.getAr() : 0;
    }

    @Override
    public String toString() {
        return "Film címe: " + getCim() + ", Korhatár: " + korh;
    }

}
