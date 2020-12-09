package Actions;

public class Packing extends ActionLeft {
    @Override
    public Integer getActEnergy() {
        return 4;
    }

    @Override
    public String Act() {
        return "packing cameras";
    }
}
