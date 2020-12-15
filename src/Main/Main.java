package Main;

import Actions.*;
import People.*;
import Status.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /**
     * Main
     * @param args arguments
     */
    public static void main(String[] args) throws IOException, IllegalTimeException {
        //Declare Arraylist of Actions of each type of People
        ArrayList<Action> fanAction = fanAction();
        ArrayList<Action> camAction = camAction();
        ArrayList<Action> polAction = polAction();

        /*
          - Local inner class
          - Create a new action
          - Add it to ArrayList fanAction
        */
        class Eating extends ActionNotYet{
            @Override
            public Integer getActEnergy() {
                return 0;
            }

            @Override
            public String Act() {
                return "eats ChocoPie";
            }
        }
        fanAction.add(new Eating());

        Status nowStatus;
        Minute minuteNow;
        int time = setTime();            // Initialize the time from method setTime
        for (int i = 0; i < Minute.values().length; i++){                 //Loop with enum
            minuteNow = Minute.values()[i];
            System.out.printf("\n-----It's %s%s now!\n-----", time, minuteNow);
            if (i <= 1){                                                //Status: notYet()
                nowStatus = new NotYet();                               //Initialize nowStatus
                System.out.println(nowStatus.Stt());
                /*
                   - Anonymous class
                   - Create a new object of People
                 */
                People baby = new People("Kitty", nowStatus, fanAction){
                    @Override
                    public String toString() {
                        return "Baby " + super.toString();
                    }
                };
                System.out.println(baby.toString());

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
     * Set time. Time is a number in range [0;23].
     * @return time as a number
     * @throws IOException A checked exception, will occur if enter not a number.
     * @throws IllegalTimeException A checked exception, will occur if the number isn't in range [0;23]
     */
    private static Integer setTime() throws IOException, IllegalTimeException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the time: " );
        int time = Integer.parseInt(reader.readLine());
        if (time < 0 || time >= 24) {
            throw new IllegalTimeException("Time must be a number in range [0;23]!. ");
        }
        else
            return time;
    }
    /**
     * Declare ArrayList for all of People
     * Loop "for" to get each elements of People
     * @param fanAction ArrayLists of actions of Fan
     * @param camAction ArrayLists of actions of Cameraman
     * @param polAction ArrayLists of actions of Police
     * @param nowStatus nowStatus
     */
    private static void allPeopleAct(ArrayList<Action> fanAction, ArrayList<Action> camAction, ArrayList<Action> polAction, Status nowStatus) {
        ArrayList<People> allPeople = allPeople(fanAction, camAction, polAction, nowStatus);
        People.Water water = new People.Water();        // Create an object of the static inner class.
        for (People pp: allPeople){
            System.out.println(pp.toString());
            if (water.isThirsty()) {
                System.out.print("  " + pp.name + " is thirsty, ");
                /*
                 - If (random<=0.3) -> assign (water=null) -> NullPointerException
                 - NullDrinkRuntimeException: unchecked exception
                 */
                if (Math.random() <= 0.3) {
                    System.out.println("but, it seems that, water is over...");
                    water = null;
                }
                try {
                    water.drink();
                }
                catch (NullPointerException e) {
                    throw new NullDrinkRuntimeException("Object Water is null! ", e);
                }
            }
        }
    }

    /**
     * Create ArrayLists of Fan
     * @param fanAction ArrayLists of actions of Fan
     * @param camAction ArrayLists of actions of Cameramen
     * @param polAction ArrayLists of actions of Police
     * @param nowStatus nowStatus
     * @return ArrayLists of Fan
     */
    static ArrayList<People> allPeople(ArrayList<Action> fanAction, ArrayList<Action> camAction, ArrayList<Action> polAction, Status nowStatus) {
        return new ArrayList<People>(){{
            add(new Fan("Kate", nowStatus, fanAction));
            add(new Fan("Jane", nowStatus, fanAction));
            add(new Cameraman("Alex", nowStatus, camAction));
            add(new Cameraman("John", nowStatus, camAction));
            add(new Police("Peter", nowStatus, polAction));
            add(new Police("David", nowStatus, polAction));
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
