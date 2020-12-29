public class ItalianHoagie extends Hoagie {


    String [] meatUsed = {"Salami","Pepperoni","Capicola Ham"};
    String [] cheeseUsed = {"Cheddar","Parmesan","Gouda"};
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
        System.out.print("Meat:");

        for(int i=0;i<meatUsed.length;i++){
            System.out.print(meatUsed[i]);

        }
        System.out.println("");
    }

    @Override
    void addCheese() {

        System.out.print("Cheese:");

        for(int i=0;i<cheeseUsed.length;i++){
            System.out.print(cheeseUsed[i]);

        }
        System.out.println("");
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
