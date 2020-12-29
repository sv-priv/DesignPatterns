public class Dog extends Animal{

    public Dog(String name, double height, int weight, String favFood, double speed, String sound) {
        super(name, height, weight, favFood, speed, sound);

        flyingType=new CantFly();
        // ke se setira so polimorfizam
    }

    @Override
    public void setSound(String sound) {
        super.setSound("bark");
    }
}
