package sk.uniza.fri.wof.hra;

import sk.uniza.fri.wof.prostredie.Miestnost;
import sk.uniza.fri.wof.prostredie.Prostredie;

public class Hrac {
    private Miestnost aktualnaMiestnost;

    public Hrac(Prostredie prostredie) {
        this.aktualnaMiestnost = prostredie.getStartovaciaMiestnost();
    }

    public void vypisPopisAktualnejMiestnosti() {
        this.aktualnaMiestnost.vypisPopisMiestnosti();
    }

    public boolean chodVSmere(String smer) {
        Miestnost novaMiestnost = this.aktualnaMiestnost.getMiestnostVSmere(smer);

        if (novaMiestnost == null) {
            return false;
        }

        this.aktualnaMiestnost = novaMiestnost;
        return true;
    }
}
