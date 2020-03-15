public class Master implements Playable {

   public int money;
   public int mood;

   public Master(int money, int mood){
       this.money = money;
       this.mood = mood;

   }


   public int spoilShoes(){
       return money-10;
   }


    @Override
    public int play() {
        return mood+=1;
    }
}
