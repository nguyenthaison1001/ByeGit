package Actions;

public class Talking extends ActionNotYet{
    @Override
    public Integer getActEnergy() {
        return 6;
    }
    @Override
    public String Act() {
        return "talks to friends";
    }
}
