public class VeggieHoagie extends Hoagie{


    String [] veggiesUsed = {"tomatoes","onions","lettuce"};
    String [] condimentsUsed = {"oil","vinegar","chilly"};


    public void makeSandwich(){

        cutBun();
        addMeat();
        addCheese();
        addVeggies();
        addCondiments();
        wrapTheHoagie();
    }


    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVeggies() {
        System.out.print("Veggies:");

        for(int i=0;i<veggiesUsed.length;i++){
            System.out.print(veggiesUsed[i]);

        }
        System.out.println("");
    }

    @Override
    void addCondiments() {
        System.out.print("Condiments:");

        for(int i=0;i<condimentsUsed.length;i++){
            System.out.print(condimentsUsed[i]);

        }
        System.out.println("");
    }


}
