public abstract class Cat {
    public String name;
    String breed;


   public Cat(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public abstract void layOnSofa();

    public abstract void spoilShoes();

    public abstract void hatePeople();

    public abstract void saveWorld();
}
