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
        System.out.println("Ahoj, ja som tu nejaka vratnicka. A ty si?");
        System.out.print("> ");
        vstup.nextLine();
        System.out.println("Tak cau.");
        System.out.println("1. Ako sa mas?");
        System.out.println("2. Nemas pre mna nejaku ulohu?");
        System.out.println("0. Ukoncit rozhovor");
        System.out.print("Vyber moznost > ");
        switch (vstup.nextLine()) {
            case "1":
                System.out.println("Vsetko ma boli, tak nezavadzaj");
                System.out.println("0. Ukonci rozhovor");
                System.out.print("Vyber moznost > ");
                vstup.nextLine();
                break;
            case "2":
                System.out.println("Tak ja neviem, dones mi aspirin.");
                System.out.println("1. Lekarne zavreli kvoli covid");
                System.out.println("2. Skusim nejaky najst");
                System.out.println("0. Ukonci rozhovor");
                System.out.print("Vyber moznost > ");
                switch (vstup.nextLine()) {
                    case "1":
                        System.out.println("Joj, tak padaj prec.");
                        System.out.println("0. Ukonci rozhovor");
                        System.out.print("Vyber moznost > ");
                        vstup.nextLine();
                        break;
                    case "2":
                        System.out.println("Ach to budes zlaty.");
                        System.out.println("0. Ukonci rozhovor");
                        System.out.print("Vyber moznost > ");
                        vstup.nextLine();
                        break;
                }
                break;
        }
    }
}
