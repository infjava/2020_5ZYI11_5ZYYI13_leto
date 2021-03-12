package sk.uniza.fri.wof.prostredie.npc;

import java.util.Scanner;

public class NpcDialogVstup {
    private final String replikaNpc;

    public NpcDialogVstup(String replikaNpc) {
        this.replikaNpc = replikaNpc;
    }

    public String vykonaj() {
        Scanner vstup = new Scanner(System.in);
        System.out.println();
        System.out.print("> ");
        return vstup.nextLine();
    }
}
