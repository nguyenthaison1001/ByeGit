package Actions;

public class BlowingWhistle extends ActionArrived{
    /**
     * Set energy for action
     * @return number of energy
     */
    @Override
    public Integer getActEnergy() {
        return 15;
    }

    /**
     * Describe the action
     * @return string
     */
    @Override
    public String Act() {
        return "blows whistle";
    }
}
