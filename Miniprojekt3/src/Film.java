public class Film {
    private String cim;
    private int ar;
    private int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }

    public String getCim() {
        return this.cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getAr() {
        return this.ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        for(int i = 0; i < this.velemenyek.length; ++i) {
            if (this.velemenyek[i] == 0) {
                this.velemenyek[i] = velemeny;
                break;
            }
        }

    }

    public double Atlag() {
        int sum = 0;
        int count = 0;

        for(int i = 0; i < this.velemenyek.length; ++i) {
            if (this.velemenyek[i] != 0) {
                sum += this.velemenyek[i];
                ++count;
            }
        }

        if (count == 0) {
            System.out.println("A film még nem kapott véleményt!");
            return 0.0;
        } else {
            return (double)sum / (double)count;
        }
    }

    public String toString() {
        return "Film cim:'" + this.cim + "'Film ara:" + this.ar;
    }
}

