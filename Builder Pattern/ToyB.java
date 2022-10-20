public class ToyB extends IToyBuilder{
    Toy toy=new Toy();

    @Override
    public void SetMaterialType() {
        toy.MaterialType="Metal";
        
    }

    @Override
    public void SetModelName() {
        toy.ModelName="TwoHeadMetal";       
    }

    @Override
    public void SetHead() {
        toy.Head=2;        
    }

    @Override
    public void SetLegs() {
        toy.Legs=3;        
    }

    @Override
    public void Sethands() {
        toy.hands=2;
        
    }

    @Override
    public Toy getToy() {
        System.out.println(toy.ModelName);
        return toy;
    }
}
