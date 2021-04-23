package pl.jakubkrys.best_webinar_ever;

public class Webinar implements Comparable<Webinar>{

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

    @Override
    public int compareTo(Webinar w2) {

        int w1Result = getSignedUp() - getPresent();
        int w2Result = w2.getSignedUp() - w2.getPresent();

        if (w1Result > w2Result){
            return -1;
        } else if (w1Result < w2Result){
            return 1;
        } else {
            return 0;
        }
    }
}
