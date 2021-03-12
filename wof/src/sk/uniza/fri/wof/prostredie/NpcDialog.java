package sk.uniza.fri.wof.prostredie;

import java.util.Scanner;

public class NpcDialog {
    private final String replikaNpc;
    private final String[] replikyHraca;

    public NpcDialog(String replikaNpc, String[] replikyHraca) {
        this.replikaNpc = replikaNpc;
        this.replikyHraca = replikyHraca;
    }

    public int vykonaj() {
        Scanner vstup = new Scanner(System.in);

        System.out.println(this.replikaNpc);
        int no = 1;
        for (String replika : this.replikyHraca) {
            System.out.printf("%d. %s%n", no, replika);
            no++;
        }
        System.out.println("0. Ukonci rozhovor");

        int moznost = -1;
        do {
            System.out.format("Vyber moznost (0-%d)> ", this.replikyHraca.length);
            String riadok = vstup.nextLine();
            Scanner riadokScanner = new Scanner(riadok);
            if (riadokScanner.hasNextInt()) {
                moznost = riadokScanner.nextInt();
            }
        } while (moznost < 0 || moznost > this.replikyHraca.length);

        return moznost;
    }
}
