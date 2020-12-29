interface ITarget{
    public void request();
}
class  Adaptee{

    public void specificRequest(){
        System.out.println("dooone");
    }
}
class Adapterco implements ITarget{

    Adaptee adaptee;

    public Adapterco(Adaptee a){
        this.adaptee =a;
    }
    @Override
    public void request() {
        adaptee.specificRequest();

    }
}


public class Adapter  {

    public static void main(String[] args) {

        ITarget in = new Adapterco(new Adaptee());
        in.request();

    }

}
