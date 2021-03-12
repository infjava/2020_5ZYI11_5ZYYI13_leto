package sk.uniza.fri.wof.prostredie;

public class Prostredie {
    private final Miestnost startovaciaMiestnost;

    public Prostredie() {
        // vytvorenie miestnosti
        Miestnost ra6 = new Miestnost("RA006 - krasna ucebna, plna pocitacov, mysi a potkanov");
        Miestnost chodbaA = new Miestnost("chodba a - dlha chodba so svetlom monitorov na konci");
        Miestnost wcA = new Miestnost("wc - nezabudni si zobrat mobil, nech sa nenudis");
        Miestnost jedalen = new Miestnost("jedalen - rozvoniava tu jedlo z krabicky");
        Miestnost chodbaC = new Miestnost("chodba c - podzemna chodba");
        Miestnost vestibula = new Miestnost("vestibula - tu zacinas svoju put");
        Miestnost ic = new Miestnost("ic - vdaka mnozstvu knih naokolo tu kazdy vyzera kusok inteligentnejsie");
        Miestnost wcC = new Miestnost("wc - ked musis, tak musis - aj v podzemi");
        Miestnost aula = new Miestnost("aula - nieco ako muciaren");
        Miestnost chodbaB = new Miestnost("chodba b - temna chodba");
        Miestnost chillZone = new Miestnost("chill zone - ak niekto nema internet zo sebou, tu nejaky najde vzdy");

        // inicializacia miestnosti = nastavenie vychodov
        ra6.nastavVychod("vychod", chodbaA);

        chodbaA.nastavVychod("zapad", ra6);
        chodbaA.nastavVychod("vychod", wcA);
        chodbaA.nastavVychod("juh", vestibula);
        chodbaA.nastavVychod("dole", chodbaC);

        wcA.nastavVychod("zapad", chodbaA);

        jedalen.nastavVychod("vychod", chodbaC);

        chodbaC.nastavVychod("zapad", jedalen);
        chodbaC.nastavVychod("zapad2", wcC);
        chodbaC.nastavVychod("juh", aula);
        chodbaC.nastavVychod("hore", chodbaA);

        vestibula.nastavVychod("sever", chodbaA);
        vestibula.nastavVychod("vychod", ic);
        vestibula.nastavVychod("juh", chodbaB);

        vestibula.postavNpc(new Npc("vratnicka"));
        vestibula.postavNpc(new Npc("bufetarka"));

        ic.nastavVychod("zapad", vestibula);

        wcC.nastavVychod("vychod", chodbaC);

        aula.nastavVychod("sever", chodbaC);

        chodbaB.nastavVychod("sever", vestibula);
        chodbaB.nastavVychod("juh", chillZone);

        chillZone.nastavVychod("sever", chodbaB);

        this.startovaciaMiestnost = vestibula;
    }

    public Miestnost getStartovaciaMiestnost() {
        return this.startovaciaMiestnost;
    }
}
