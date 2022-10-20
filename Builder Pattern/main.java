public class main {
    public static void main(String[] args) {
        ToyCreator tA=new ToyCreator(new ToyB());
        tA.createToy();
        tA.getToy();
        
        System.out.println(tA);
    }
}
