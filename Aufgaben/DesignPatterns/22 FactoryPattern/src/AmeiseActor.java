public class AmeiseActor extends AbstractActor{
    public AmeiseActor(String typ, String name) {
        super(typ, name);
    }

    @Override
    public void sayHello() {
        System.out.println("ich bin eine Ameise");
    }
}
