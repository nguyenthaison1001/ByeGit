package Actions;

public class Shooting extends ActionArrived{
    @Override
    public Integer getActEnergy() {
        return 19;
    }
    @Override
    public String Act() {
        return "taking photos";
    }
}
