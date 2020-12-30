public interface IObservable {

    public void add(IObserver i);
    public void remove(IObserver i);
    public void notifyObservers();


}
