/**
 * Trieda Miestnost realizuje jednu miestnost/priestor v celom priestore hry.
 * Kazda "miestnost" je z inymi miestnostami spojena vychodmi. 
 * Vychody z miestnosti su oznacovane svetovymi stranami sever, vychod, juh
 * a zapad. Pre kazdy vychod si miestnost pamata odkaz na susednu miestnost
 * alebo null, ak tym smerom vychod nema.
 *
 * @author  Michael Kolling, David J. Barnes
 * @version 2006.03.30
 * @author  lokalizacia: Lubomir Sadlon, Jan Janech
 * @version 2012.02.21
 */
public class Miestnost {
    private final String popisMiestnosti;
    private Miestnost severnyVychod;
    private Miestnost juznyVychod;
    private Miestnost vychodnyVychod;
    private Miestnost zapadnyVychod;

    /**
     * Vytvori miestnost popis ktorej je v parametrom.
     * Po vytvoreni miestnost nema ziadne vychody. Popis miesnost strucne 
     * charakterizuje.
     * 
     * @param popis text popisu miestnosti.
     */
    public Miestnost(String popis) {
        this.popisMiestnosti = popis;
    }

    /**
     * Nastavi vychody z miestnosti. Kazdy vychod je urceny bud odkazom 
     * na miestnost alebo hodnotou null, ak vychod tym smerom neexistuje.
     * 
     * @param sever miestnost smerom na sever.
     * @param vychod miestnost smerom na vychod.
     * @param juh miestnost smerom na juh.
     * @param zapad miestnost smerom na zapad.
     */
    public void nastavVychody(Miestnost sever, Miestnost vychod, Miestnost juh, Miestnost zapad) {
        if (sever != null) {
            this.severnyVychod = sever;
        }
        if (vychod != null) {
            this.vychodnyVychod = vychod;
        }
        if (juh != null) {
            this.juznyVychod = juh;
        }
        if (zapad != null) {
            this.zapadnyVychod = zapad;
        }
    }

    /**
     * @return textovy popis miestnosti.
     */
    public String getPopis() {
        return this.popisMiestnosti;
    }

    void vypisPopisMiestnosti() {
        System.out.println("Teraz si v miestnosti " + this.getPopis());
        System.out.print("Vychody: ");
        if (this.severnyVychod != null) {
            System.out.print("sever ");
        }
        if (this.vychodnyVychod != null) {
            System.out.print("vychod ");
        }
        if (this.juznyVychod != null) {
            System.out.print("juh ");
        }
        if (this.zapadnyVychod != null) {
            System.out.print("zapad ");
        }
        System.out.println();
    }

    Miestnost getMiestnostVSmere(String smer) {
        Miestnost novaMiestnost = null;
        switch (smer) {
            case "sever":
                novaMiestnost = this.severnyVychod;
                break;
            case "vychod":
                novaMiestnost = this.vychodnyVychod;
                break;
            case "juh":
                novaMiestnost = this.juznyVychod;
                break;
            case "zapad":
                novaMiestnost = this.zapadnyVychod;
                break;
        }
        return novaMiestnost;
    }
}
