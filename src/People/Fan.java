package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public class Fan extends People {
//    Hungry hungry;
    /**
     * Constructor of class Fan to create an object Fan
     * @param name name
     * @param nowStatus nowStatus
     * @param fanAction fanAction
     */
    public Fan(String name, Status nowStatus, ArrayList<Action> fanAction) {
        super(name, nowStatus, fanAction);
    }

    @Override
    public String toString() {
//        Hungry hungry;
        String str = super.toString();
        str = "Fan " + str;
        Hungry hungry = new Hungry();
        return str.substring(0,str.length()-1) + hungry.checkHungry();
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

    /**
     * Non-static nested class.
     * If random<=0.3 -> isHungry -> lose energy.
     */
    private class Hungry{
        boolean isHungry = false;
        public int energyLost = 5;
        public String checkHungry(){
            if (Math.random() <= 0.3){
                isHungry = true;
                return ("\n  It's time to eat, " + name + " is so hungry => lost " +energyLost+ " energy more!");
            } return "";
        }
    }
}