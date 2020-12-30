public class ObserverPatternTest {
    public static void main(String[] args) {

        Stocks observable = new Stocks();
        Stock observer1 = new Stock(observable);
        Stock observer2 = new Stock(observable);
        Stock observer3 = new Stock(observable);


//        observer1.update(1000,2000,3000);
//        observer2.update(100,200,300);

        observable.setGoogPrice(1000);
        observable.setIbmPrice(100000);
        observable.setApplPrice(30000);
        observer3.printThePrices();
        observer3.update(1000,2050, 30000);



    }
}
