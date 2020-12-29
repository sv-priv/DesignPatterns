public class AnimalMain {

    public static void main(String[] args) {

        Animal Frenchie = new Dog("French",30,20,"dogfood",1,"");
        Animal Birdy = new Bird("BIrdy",10,3,"birdfood",40,"");
        System.out.println(Frenchie.tryToFly());
        System.out.println(Birdy.tryToFly());


    }
}
