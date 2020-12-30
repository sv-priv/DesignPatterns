public class Stock implements IObserver {

    private double ibmPrice;
    private double applPrice;
    private double googPrice;
    private static int observerIDTracker = 0;
    private int observerID;

    //observer has a observable(one)

    // observable has a observer(0 to many), contains list of observers
    //when we change the content in the observer, it will know what to remove in the Observable, so it can notify new updated info to all


    private Stocks stockObservable;

    public Stock(Stocks stockObservable) {
        this.stockObservable = stockObservable;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer: " + this.observerID);
        stockObservable.add(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {

        this.ibmPrice=ibmPrice;
        this.applPrice=applPrice;
        this.googPrice=googPrice;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID + "\nIBM: "+ ibmPrice + "\nAPPL: "+ applPrice+ "\nGOOG: "+ googPrice);
    }
}
