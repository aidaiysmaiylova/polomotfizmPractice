public class Car {
    private String function;
    private int expirationDateOfWork;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getExpirationDateOfWork() {
        return expirationDateOfWork;
    }

    public void setExpirationDateOfWork(int expirationDateOfWork) {
        this.expirationDateOfWork = expirationDateOfWork;
    }

    @Override
    public String toString() {
        return "function: " + function + '\'' +
                "Expiration date of work: " + expirationDateOfWork;
    }

    public Car(String function, int expirationDateOfWork) {
        this.function = function;
        this.expirationDateOfWork = expirationDateOfWork;


    }
}
