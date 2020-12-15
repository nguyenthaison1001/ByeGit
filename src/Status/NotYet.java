package Status;

public class NotYet implements Status {
    /**
     * Status is not yet
     * => isNotYet: true
     * @return true
     */
    @Override
    public boolean isNotYet(){return true;}

    /**
     * Status is not yet
     * => isArrived: false
     * @return false
     */
    @Override
    public boolean isArrived(){return false;}

    /**
     * Status is not yet
     * => isLeft: false
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
        return "Joe Biden has not arrived yet!!!";
    }
}
