package Actions;

public class CleaningCrowd extends ActionArrived{
    /**
     * Set energy for action
     * @return number of energy
     */
    @Override
    public Integer getActEnergy() {
        return 17;
    }

    /**
     * Describe the action
     * @return string
     */
    @Override
    public String Act() {return "cleans the crowd";}
}
