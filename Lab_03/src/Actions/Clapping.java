package Actions;

public class Clapping extends ActionArrived {
    /**
     * Set energy for action
     * @return number of energy
     */
    @Override
    public Integer getActEnergy() {
        return 16;
    }

    /**
     * Describe the action
     * @return string
     */
    @Override
    public String Act() {
        return "applauding";
    }
}
