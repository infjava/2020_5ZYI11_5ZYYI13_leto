package sk.uniza.fri.wof.prostredie.npc;

public class Bufetarka implements INpc {
    @Override
    public String getMeno() {
        return "bufetarka";
    }

    @Override
    public void hovor() {
        NpcDialog doprogramuj = new NpcDialog("Zatial nemas naprogramovane predmety, tak sa s tebou nebavim");
        doprogramuj.vykonaj();
    }
}
