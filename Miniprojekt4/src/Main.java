public class Main {
    public static void main(String[] args) {

    TakarekSzamla tsz = new TakarekSzamla("Teszt Elek" , 1.25);
    RegularisSzamla rsz = new RegularisSzamla("Teszt Bela");
    FolyoSzamla fsz = new FolyoSzamla("Teszt Klara");

    tsz.betesz(1230);
    rsz.betesz(1230);
    fsz.betesz(1230);
    try {
        tsz.kivesz(2000);
        rsz.kivesz(1230);
        fsz.kivesz(500);
        fsz.betesz(100);
        fsz.kivesz(100);
    }
    catch (NincsElegendoOsszegException exp){
        System.out.println(exp);
    }

    fsz.levonKoltseg();
    tsz.hozzaadKamat();

    System.out.println(tsz);
    System.out.println(rsz);
    System.out.println(fsz);

    for (Tranzakcio t: rsz.tranzakciok){
        if(t.tranzTipus == TranzakcioTipus.DEPOSIT){
            System.out.println(t);
        }
    }


    }
}