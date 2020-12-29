public class Main {
    public static void main(String[] args) {


        Hoagie meatSand = new ItalianHoagie();
        Hoagie veggieSand = new VeggieHoagie();

        meatSand.makeSandwich();
        veggieSand.makeSandwich();
    }
}
