package models;

import utilities.HelperMethods;

public class TrEvent extends HelperMethods {

    private int eventId;
    private String eventName; //unique not null
    private double costModifier;
    private String gradeScale;


    //<><><><><>-----------------------------<><><><><>
    //<><><><><>---------Constructor---------<><><><><>
    //<><><><><>-----------------------------<><><><><>


    public TrEvent() {}

    public TrEvent(int eventId, String eventName, double costModifier, String gradeScale) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.costModifier = costModifier;
        this.gradeScale = gradeScale;
    }

    //<><><><><>-----------------------------<><><><><>
    //<><><><><>-----Getters and Setters-----<><><><><>
    //<><><><><>-----------------------------<><><><><>


    public int getEventId() {return eventId;}

    public void setEventId(int eventId) {this.eventId = eventId;}

    public String getEventName() {return eventName;}

    public void setEventName(String eventName) {this.eventName = eventName;}

    public double getCostModifier() {return costModifier;}

    public void setCostModifier(double costModifier) {this.costModifier = costModifier;}

    public String getGradeScale() {return gradeScale;}

    public void setGradeScale(String gradeScale) {this.gradeScale = gradeScale;}
}
