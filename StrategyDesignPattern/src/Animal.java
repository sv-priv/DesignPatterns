public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Fly flyingType; // na animal klasata ne i e vazno od kakov tip e letanjeto



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }
    public void setFlyingType(Fly newFlyingType){

        flyingType=newFlyingType;

    }

    public Animal(String name, double height, int weight, String favFood, double speed, String sound) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.favFood = favFood;
        this.speed = speed;
        this.sound = sound;
    }

}
