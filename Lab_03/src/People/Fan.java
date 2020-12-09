package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Fan extends People {
    /**
     * Constructor of class Fan to create an object Fan
     * @param name name
     * @param nowStatus nowStatus
     * @param fanAction fanAction
     */
    public Fan(String name, Status nowStatus, ArrayList<Action> fanAction){
        super(name, nowStatus, fanAction); }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Fan " + str;
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fan){
            Fan another = (Fan) obj;
            return this.name.equals(another.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()%10;
    }
}
