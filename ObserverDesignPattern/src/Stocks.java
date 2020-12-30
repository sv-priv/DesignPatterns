import java.util.ArrayList;

public class Stocks implements IObservable{

    private ArrayList<IObserver> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public Stocks(){
        observers = new ArrayList<>();
    }
    @Override
    public void add(IObserver i) {

        observers.add(i);
    }

    @Override
    public void remove(IObserver i) {

        int observerIndex = observers.indexOf(i);
//        System.out.println("The stock ");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {

        for(IObserver observer : observers){
            observer.update(this.ibmPrice,this.applPrice,this.googPrice);
        }
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public double getApplPrice() {
        return applPrice;
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObservers();

    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();

    }
}
