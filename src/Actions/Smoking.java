package Actions;

public class Smoking extends ActionLeft{
    /**
     * Set energy for action
     * @return number of energy
     */
    @Override
    public Integer getActEnergy() {
        return 1;
    }

    /**
     * Describe the action
     * @return string
     */
    @Override
    public String Act() {
        return "smokes";
    }
}
