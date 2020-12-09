package Actions;

public class GoingHome extends ActionLeft{
    @Override
    public Integer getActEnergy() {
        return 2;
    }

    @Override
    public String Act() {
        return "very joyful and going home";
    }
}
