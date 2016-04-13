package ua.goit.java;

/**
 * Created by 7 on 19.03.2016.
 */
public abstract class Instrument{
    public abstract String getType();
    public String toString() {
        return "Instrument{"+getType()+"}";
    }
}
