package Actions;

public abstract class ActionLeft implements Action {
    /**
     * Status: Left => return -1
     * @return -1
     */
    @Override
    public Integer getStatus() {
        return -1;
    }
}
