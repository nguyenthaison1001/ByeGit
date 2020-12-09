package Actions;

public class Resting extends ActionLeft{
    @Override
    public Integer getActEnergy() {
        return 0;
    }

    @Override
    public String Act() {
        return "time to rest";
    }
}
