package pt.up.fe.ldts.example6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tree {
    public Date plantedAt;

    private Location location;
    private final List<Date> appraisalDates;

    public Tree(Date plantedAt, Location location){
        this.plantedAt = plantedAt;
        this.location = location;
        this.appraisalDates = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public String toString() {
        return "Tree planted at " + this.plantedAt.toString() + " in location " + this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    void addAppraisal(Date appraisalDate) {
        this.appraisalDates.add(appraisalDate);
    }

    public List<Date> getAppraisals(){
        return this.appraisalDates;
    }

    public boolean isNextAppraisalOverdue(){
        Date today = new Date();
        Date latestAppraisalDate = today;

        if (!this.appraisalDates.isEmpty()) {
            latestAppraisalDate = this.appraisalDates.get(0);
        }

        for(Date appraisalDate : this.appraisalDates) {
            if (latestAppraisalDate.before(appraisalDate)) {
                latestAppraisalDate = appraisalDate;
            }
        }

        // Calculate next appraisal date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(latestAppraisalDate);
        calendar.add(Calendar.MONTH, 3);

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 2);

        Date nextAppraisalDate = calendar.getTime();
        // Appraisal is only overdue if its date is in the past
        return nextAppraisalDate.before(today);
    }
}
