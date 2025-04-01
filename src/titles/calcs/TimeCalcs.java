package titles.calcs;

import titles.model.Titles;
import titles.model.Series;


public class TimeCalcs {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Titles title){
        this.totalTime += title.getLength();
    }
}
