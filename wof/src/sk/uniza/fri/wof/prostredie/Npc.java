package sk.uniza.fri.wof.prostredie;

import java.util.Scanner;

public class Npc {
    private final String meno;

    public Npc(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return this.meno;
    }

    public void hovor() {
        Scanner vstup = new Scanner(System.in);
        switch (this.meno) {
            case "vratnicka":
                System.out.println("Ahoj, ja som tu nejaka vratnicka. A ty si?");
                System.out.print("> ");
                vstup.nextLine();
                NpcDialog uvod = new NpcDialog("Tak cau.", "Ako sa mas?", "Nemas pre mna nejaku ulohu?");
                switch (uvod.vykonaj()) {
                    case 1:
                        NpcDialog vsetkoMaBoli = new NpcDialog("Vsetko ma boli, tak nezavadzaj.");
                        vsetkoMaBoli.vykonaj();
                        break;
                    case 2:
                        NpcDialog donesAspirin = new NpcDialog("Tak ja neviem, dones mi aspirin.", "Lekarne zavreli kvoli covid", "Skusim nejaky najst");
                        switch (donesAspirin.vykonaj()) {
                            case 1:
                                NpcDialog padajPrec = new NpcDialog("Joj, tak padaj prec.");
                                padajPrec.vykonaj();
                                break;
                            case 2:
                                NpcDialog zlaty = new NpcDialog("Ach to budes zlaty.");
                                zlaty.vykonaj();
                                break;
                        }
                        break;
                }
                break;
            case "bufetarka":
                NpcDialog doprogramuj = new NpcDialog("Zatial nemas naprogramovane predmety, tak sa s tebou nebavim");
                doprogramuj.vykonaj();
                break;
        }
    }
}
