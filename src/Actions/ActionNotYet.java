package Actions;

public abstract class ActionNotYet implements Action {
    /**
     * Status: NotYet => return 0
     * @return
     */
    @Override
    public Integer getStatus() {
        return 0;
    }
}
