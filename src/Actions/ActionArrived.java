package Actions;

public abstract class ActionArrived implements Action {
    /**
     * Status: Arrived => return 1
     * @return
     */
    @Override
    public Integer getStatus() {
        return 1;
    }
}
