package People;

import Actions.*;
import Status.*;

import java.util.ArrayList;

public class Cameraman extends People {
    /**
     * Constructor of class Cameraman to create an object Cameraman
     * @param name name
     * @param nowStatus nowStatus
     * @param camAction camAction
     */
    public Cameraman(String name, Status nowStatus, ArrayList<Action> camAction){
        super(name, nowStatus, camAction);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Cameraman " + str;
        return str;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cameraman){
            Cameraman another = (Cameraman) obj;
            return this.name.equals(another.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()%12;
    }
}
