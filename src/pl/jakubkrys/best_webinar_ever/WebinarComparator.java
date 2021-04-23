package pl.jakubkrys.best_webinar_ever;

import java.util.*;

public class WebinarComparator implements Comparator<Webinar> {


    @Override
    public int compare(Webinar w1, Webinar w2) {
        if (w1 == null){
            return -1;
        }

        int w1Result = w1.getSignedUp() - w1.getPresent();
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
