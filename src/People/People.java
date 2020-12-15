package People;

import Actions.Action;
import Status.Status;

import java.util.ArrayList;

public abstract class People {
    public String name;
    private final Status nowStatus;
    private final ArrayList<Action> allAction;                           //ArrayList of all actions
    private final ArrayList<Action> chosenActions = new ArrayList<>();   //ArrayList of chosen action

    /**
     * Constructor to create an abstract object People
     * @param name name
     * @param nowStatus nowStatus of this person
     * @param allAction all Actions of this person
     */
    public People(String name, Status nowStatus, ArrayList<Action> allAction){
        this.name = name;
        this.nowStatus = nowStatus;
        this.allAction = allAction;
    }

    /**
     * Set up nowStatus
     * @return index Status of nowStatus
     */
    public Integer setStatus(){
        if (nowStatus.isNotYet()) return 0;
        else if (nowStatus.isArrived()) return 1;
        else if (nowStatus.isLeft()) return -1;
            return null;
    }

    /**
     * Person chooses random some actions
     * Add chosen actions into ArrayList chosenAction
     */
    public void chooseAction(){
        chosenActions.clear();
        while (chosenActions.isEmpty()) {
            for (Action action : allAction) {
                if (setStatus().equals(action.getStatus())){
                    if (Math.random() > 0.6) {
                        chosenActions.add(action);
                    }}}}}

    /**
     * Get total energy of chosen actions
     * @return total energy
     */
    public Integer getLostEnergy(){
        int  en = 0;
        for (Action action: chosenActions) {
            en = en + action.getActEnergy();
        }
        return en;
    }

    /**
     * Method displays: name, list of selected actions
     * 3 cases: en<15, en<30, en <50
     * @return a description string
     */
    public String toString(){
        chooseAction();
        int en = getLostEnergy();
        String str = name + " ";
        for (Action action: chosenActions){
            str += action.Act() + ", "; //" (-" + action.getActEnergy() + " energy), ";
        }
        str = str.substring(0, str.length()-2) + ". " + name + " lost " + en + " energy. ";
        if (en < 15) str += name + " is very exited. ";
        else if (en < 30) str += name + "'s a bit tired. ";
        else str += "So " + name + "'s very tired and needs some rest. ";
        return str;
    }

    /**
     * Static nested class.
     * If random<=2 -> is thirsty -> to drink -> plus energy.
     */
    public static class Water{
        public int energyPlus = 10;
        public boolean isThirsty(){
            return Math.random() <= 0.2;
        }
        public void drink(){
            System.out.println("drinks some water => energy boosts +" + energyPlus + "!");
        }
    }
}
