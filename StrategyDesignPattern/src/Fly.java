public interface Fly {

    String fly();
}

class ItFlys implements Fly{

    @Override
    public String fly() {
        return "can fly";
    }
}
class CantFly implements Fly{

    @Override
    public String fly() {
        return "can't fly";
    }
}

// create many different types of Fly without affecting Animal or any of the subclasses
// wi will include the the fly interface as a composition instead of inheritance

// ova  e decoupling zatoa sto go enkapsulirame konceptot/odnesuvanjeto sto se menuva