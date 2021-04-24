package pl.jakubkrys.webinar_collection;

public class Webinar implements Comparable<Webinar> {

    private String date;
    private String title;
    private int signedUp;
    private int present;

    public Webinar(String date, String title, int signedUp, int present) {
        this.date = date;
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
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", signedUp=" + signedUp +
                ", present=" + present +
                '}';
    }


    @Override
    public int compareTo(Webinar w2) {

        double w1Result = ((double)getPresent()/getSignedUp())*100;
        double w2Result = ((double)w2.getPresent()/w2.getSignedUp())*100;

        if (w1Result > w2Result){
            return -1;
        } else if (w1Result < w2Result){
            return 1;
        } else {
            return 0;
        }
    }
}
