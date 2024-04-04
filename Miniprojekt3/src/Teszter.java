import java.util.*;

public class Teszter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Film> filmek = new ArrayList<>();

        // Felhasználó által megadott adatok alapján Film és HorrorFilm objektumok létrehozása
        for (int i = 0; i < 6; i++) {
            System.out.println("Adja meg a(z) " + (i + 1) + ". film címét:");
            String cim = scanner.nextLine();
            System.out.println("Adja meg a(z) " + (i + 1) + ". film árát:");
            int ar = Integer.parseInt(scanner.nextLine());
            System.out.println("Adja meg a(z) " + (i + 1) + ". film korhatárát (ha van):");
            int korhatar = Integer.parseInt(scanner.nextLine());

            if (korhatar == 0) {
                filmek.add(new Film(cim, ar));
            } else {
                filmek.add(new HorrorFilm(cim, ar, korhatar));
            }
        }

        // Lista kiíratása konzolra
        System.out.println("\nLista elemei:");
        for (Film film : filmek) {
            System.out.println(film);
        }

        // Lista rendezése ár szerint és újra kiíratás
        Collections.sort(filmek, Comparator.comparingInt(Film::getAr));
        System.out.println("\nA filmek ár szerint rendezve:");
        for (Film film : filmek) {
            System.out.println(film);
        }

        // HorrorFilmek kiválogatása és IKorhataros tömbbe másolása
        IKorhatar[] korhatarosFilmek = new IKorhatar[6];
        int index = 0;
        for (Film film : filmek) {
            if (film instanceof HorrorFilm) {
                korhatarosFilmek[index] = (HorrorFilm) film;
                index++;
            }
        }

        // IKorhataros tömb kiíratása
        System.out.println("\nKorhatáros filmek:");
        for (IKorhatar korhatarosFilm : korhatarosFilmek) {
            if (korhatarosFilm != null) {
                System.out.println(korhatarosFilm);
            }
        }

        // Megadott életkor alapján büntetés kiszámítása
        System.out.println("\nAdja meg az életkorát a büntetés kiszámításához:");
        int kor = Integer.parseInt(scanner.nextLine());
        int osszBuntetes = osszesBuntetes(korhatarosFilmek, kor);
        System.out.println("Összes büntetés: " + osszBuntetes);
    }

    // Büntetések összegzése megadott életkor alapján
    public static int osszesBuntetes(IKorhatar[] korhatarosFilmek, int kor) {
        int osszBuntetes = 0;
        for (IKorhatar film : korhatarosFilmek) {
            if (film != null) {
                osszBuntetes += film.Buntetes(kor);
            }
        }
        return osszBuntetes;
    }
}
