import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;
        import java.util.ArrayList;
        import java.util.List;

// Tranzakcio osztály
enum TranzakcioTipus {
    DEPOSIT, WITHDRAW
}

class Tranzakcio {
    protected LocalDateTime idopont;
    protected TranzakcioTipus tranzTipus;
    protected double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Időpont: " + idopont.format(formatter) + ", Tranzakció típusa: " + tranzTipus + ", Összeg: " + osszeg;
    }
}
