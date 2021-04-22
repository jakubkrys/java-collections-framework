package pl.jakubkrys.best_webinar_ever;

public class Webinar {

    private String title;
    private int signedUp;
    private int present;

    public Webinar(String title, int signedUp, int present) {
        this.title = title;
        this.signedUp = signedUp;
        this.present = present;
    }

    public int getSignedUp() {
        return signedUp;
    }

    public int getPresent() {
        return present;
    }

    @Override
    public String toString() {
        return "Webinar{" +
                "title='" + title + '\'' +
                ", signedUp=" + signedUp +
                ", present=" + present +
                '}';
    }
}
