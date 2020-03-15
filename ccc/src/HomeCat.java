public class HomeCat extends Cat implements Playable {
    Master master;


    public HomeCat(String name, String breed) {

        super(name, breed);
    }

    @Override
    public void layOnSofa(){
        System.out.println(this.name +" "+ this.breed + " says: 'Do not touch me. I'm tired.'");
    }

    @Override
    public void spoilShoes(){
        //master.money = master.money -10;
        System.out.println(this.name +" "+ this.breed + " says: 'Time to do some pee. Where are my master's shoes?...'");
        //System.out.println("Amount of master's money:");
    }

    @Override
    public void hatePeople() {

    }

    @Override
    public void saveWorld() {

    }

    @Override
    public int play(){
        System.out.println(this.name + this.breed + " says: 'Well, it's time to play...'");
        return 0;
    }

    }
