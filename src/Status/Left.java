package Status;

public class Left implements Status {
    /**
     * Status is left
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isNotYet(){return false;}

    /**
     * Status is left
     * => isNotYet: false
     * @return false
     */
    @Override
    public boolean isArrived(){return false;}

    /**
     * Status is left
     * => isNotYet: true
     * @return true
     */
    @Override
    public boolean isLeft(){return true;}

    /**
     * Information about this status
     * @return a string information about this status
     */
    public String Stt(){
        return "Joe Biden left and disappeared!!!";
        }
}
