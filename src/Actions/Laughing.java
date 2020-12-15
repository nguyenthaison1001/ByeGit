package Actions;

public class Laughing extends ActionNotYet{
    @Override
    public Integer getActEnergy() {
        return 7;
    }

    @Override
    public String Act() {
        return "laughs out loud";
    }
}