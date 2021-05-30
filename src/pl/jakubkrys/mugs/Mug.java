package pl.jakubkrys.mugs;

public class Mug {

    private String inscription;

    public Mug(String inscription) {
        this.inscription = inscription;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "inscription='" + inscription + '\'' +
                '}';
    }
}