package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Police extends People {
    /**
     * Constructor of class Police to create an object Police
     * @param name name
     * @param nowStatus nowStatus
     * @param polAction polAction
     */
    public Police(String name, Status nowStatus, ArrayList<Action> polAction){
        super(name, nowStatus, polAction);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = "Police Officer " + str;
        return str;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Police){
            Police another = (Police) obj;
            return this.name.equals(another.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()%11;
    }
}
