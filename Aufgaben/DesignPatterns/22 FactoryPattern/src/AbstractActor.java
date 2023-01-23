public abstract class AbstractActor implements Actor {
    private String typ;
    private String name;

    @Override
    public void sayHello() {
        System.out.println("ich bin eine: " + getTyp() );
        System.out.println("Mein Name ist: " + getName());
    }

    public AbstractActor(String typ, String name) {
        this.typ = typ;
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
