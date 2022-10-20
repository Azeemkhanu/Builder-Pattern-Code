public class ToyCreator{
    IToyBuilder buildToy;

    public ToyCreator(IToyBuilder buildToy) {
        this.buildToy=buildToy;
    }

    public void createToy(){
        buildToy.SetMaterialType();
        buildToy.SetModelName();
        buildToy.SetHead();
        buildToy.SetLegs();
        buildToy.Sethands();
   
    }

    public Toy getToy(){
        return buildToy.getToy();
    }

}