package sk.uniza.fri.wof.prostredie;

public class Npc {
    private final String meno;

    public Npc(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return this.meno;
    }

    public void hovor() {
        System.out.printf("Hovoris s NPC %s%n", this.meno);
    }
}
