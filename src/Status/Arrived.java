package Status;

public class Arrived implements Status {
    /**
     * Status is arrived
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isNotYet(){return false;}

    /**
     * Status is arrived
     * => isNotYet: true
     * @return true
     */
    @Override
    public boolean isArrived(){return true;}

    /**
     * Status is arrived
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isLeft(){return false;}

    /**
     * Information about this status
     * @return a string information about this status
     */
    @Override
    public String Stt(){
        return "Joe Biden is coming!!!";
    }
}
