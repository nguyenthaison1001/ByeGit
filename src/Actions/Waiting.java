package Actions;

public class Waiting extends ActionNotYet{
    @Override
    public Integer getActEnergy() {
        return 5;
    }
    @Override
    public String Act() {
        return "waits for President";
    }
}
