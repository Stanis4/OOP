public class Main {

    public static void main(String[] args) {
        System.out.println("Initial Master's mood is ");


        Master master = new Master(1000, 10);
        //System.out.println(master.money);
        System.out.println(master.mood);
        System.out.println();

        HomeCat cat1 = new HomeCat("Tom", "American Bobtail" );
        cat1.layOnSofa();
        cat1.spoilShoes();
        master.spoilShoes();
        System.out.println();

        HomeCat cat2 = new HomeCat("Tima", "Birman" );
        cat2.layOnSofa();
        cat2.play();
        System.out.println("Master's mood:" + master.play());
        System.out.println();


        WildCat wildCat1 = new WildCat("Wildy", "Tiger");
        wildCat1.hatePeople();
        System.out.println();


        WildCat wildCat12 = new WildCat("Jinny", "Lion");
        wildCat12.saveWorld();
        System.out.println();


    }
}
