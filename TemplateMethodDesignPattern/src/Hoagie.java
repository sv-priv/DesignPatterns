
public abstract class Hoagie {

    public void makeSandwich(){

        cutBun();

        if(customerWantsMeat()){
            addMeat();

        }
        if(customerWantsCheese()){
            addCheese();

        }
        if(customerWantsVeggies()){
            addVeggies();

        }
        wrapTheHoagie();

    }
    public void cutBun(){
        System.out.println("The Bun is cut");
    }
    public void wrapTheHoagie(){
        System.out.println("The bun is wrapped");
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeggies();
    abstract void addCondiments();


    //hook, user can ovveride this
    boolean customerWantsMeat(){
        return true;
    }
    boolean customerWantsCheese(){
        return true;
    }
    boolean customerWantsVeggies(){
        return true;
    }

}
