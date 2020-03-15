public class WildCat extends Cat {

    public WildCat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void layOnSofa() {

    }

    @Override
    public void spoilShoes() {

    }

    @Override
    public void hatePeople() {
        System.out.println(this.name + " " + this.breed + "says: 'I hate people!'");
    }

    @Override
    public void saveWorld() {
        System.out.println(this.name + " " + this.breed + "says: 'I am the one who will save the world!'");
    }


}
