package Actions;

public class Shouting extends ActionArrived{
    @Override
    public Integer getActEnergy() {
        return 20;
    }
    @Override
    public String Act() {
        return "loudly shouts: \"JOE BIDENNN\"";
    }
}
