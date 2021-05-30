package pl.jakubkrys.mugs;

import java.util.*;

public class MugsRepo {

    Queue <Mug> mugs = new ArrayDeque<>();

    public void addMug (Mug mug){
        mugs.offer(mug);
    }

    public Mug getMug (){
        return mugs.poll();
    }
}