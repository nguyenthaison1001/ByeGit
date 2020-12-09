package Main;

import Actions.*;
import People.*;
import Status.*;

import java.util.ArrayList;

public class Main {
    /**
     * Main
     * @param args arguments
     */
    public static void main(String[] args) {
        //Declare Arraylist of Actions of each type of People
        ArrayList<Action> fanAction = fanAction();
        ArrayList<Action> camAction = camAction();
        ArrayList<Action> polAction = polAction();

        Status nowStatus;
        Time timeNow;

        for (int i = 0; i < Time.values().length; i++){                 //Loop with enum
            timeNow = Time.values()[i];
            System.out.printf("\nIt's 9%s now!\n-----", timeNow);
            if (i <= 1){                                                //Status: notYet()
                nowStatus = new NotYet();                               //Initialize nowStatus
                System.out.println(nowStatus.Stt());
                allPeopleAct(fanAction, camAction, polAction, nowStatus);
            }
            else if (i == 2){                                           //Status: arrived()
                nowStatus = new Arrived();
                System.out.println(nowStatus.Stt());
                allPeopleAct(fanAction, camAction, polAction, nowStatus);
            }
            else {                                                      //Status: left()
                nowStatus = new Left();
                System.out.println(nowStatus.Stt());
                allPeopleAct(fanAction, camAction, polAction, nowStatus);
            }
        }
    }

    /**
     * Declare ArrayList for all of People
     * Loop "for" to get each elements of People
     * @param fanAction ArrayLists of actions of Fan
     * @param camAction ArrayLists of actions of Cameraman
     * @param polAction ArrayLists of actions of Police
     * @param nowStatus nowStatus
     */
    private static void allPeopleAct(ArrayList<Action> fanAction, ArrayList<Action> camAction, ArrayList<Action> polAction, Status nowStatus){
        ArrayList<People> allPeople = allPeople(fanAction, camAction, polAction, nowStatus);
        for (People pp: allPeople){ System.out.println(pp.toString());}
    }

    /**
     * Create ArrayLists of Fan
     * @param fanAction ArrayLists of actions of Fan
     * @param camAction ArrayLists of actions of Cameramen
     * @param polAction ArrayLists of actions of Police
     * @param nowStatus nowStatus
     * @return ArrayLists of Fan
     */
    static ArrayList<People> allPeople(ArrayList<Action> fanAction, ArrayList<Action> camAction, ArrayList<Action> polAction, Status nowStatus){
        return new ArrayList<People>(){{
            add(new Fan("Kate", nowStatus, fanAction));
            add(new Fan("Jane", nowStatus, fanAction));
            add(new Cameraman("Alex", nowStatus, camAction));
            add(new Cameraman("John", nowStatus, camAction));
            add(new Police("Peter", nowStatus, polAction));
            add(new Police("Ilia", nowStatus, polAction));
        }};
    }

    /**
     * Create ArrayLists of actions of Fan
     * @return ArrayLists of actions of Fan
     */
    static ArrayList<Action> fanAction(){
        return new ArrayList<Action>(){{
            add(new Waiting());
            add(new Talking());
            add(new Laughing());
            add(new Clapping());
            add(new Shouting());
            add(new GoingHome());
            add(new Smoking());
        }};
    }

    static ArrayList<Action> camAction(){
        return new ArrayList<Action>(){{
            add(new Waiting());
            add(new Talking());
            add(new Laughing());
            add(new Filming());
            add(new Shooting());
            add(new Packing());
            add(new Resting());
            add(new GoingHome());
        }};
    }
    static ArrayList<Action> polAction(){
        return new ArrayList<Action>(){{
            add(new Waiting());
            add(new Talking());
            add(new Laughing());
            add(new CleaningCrowd());
            add(new BlowingWhistle());
            add(new Resting());
            add(new Smoking());
            add(new GoingHome());
        }};
    }
}
