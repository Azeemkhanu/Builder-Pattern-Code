public class ToyA extends IToyBuilder{
    Toy toy=new Toy();

    @Override
    public void SetMaterialType() {
        toy.MaterialType="plastic";
        
    }

    @Override
    public void SetModelName() {
        toy.ModelName="TwoHeadPlastic";       
    }

    @Override
    public void SetHead() {
        toy.Head=2;        
    }

    @Override
    public void SetLegs() {
        toy.Legs=4;        
    }

    @Override
    public void Sethands() {
        toy.hands=4;
        
    }

    @Override
    public Toy getToy() {
        System.out.println(toy.ModelName);
        return toy;
    }
    
}
