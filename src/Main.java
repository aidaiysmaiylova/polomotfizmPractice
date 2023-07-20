public class Main {
    public static void main(String[] args)
    {
    Car car1=new Car("Protected our ecology",60);
    Car car2=new Car("Can fly to Space",20);
    Car car3=new Car("Use less gasoline",60);
    Car[]cars={car1,car2,car3};

        for(Car car:cars){
            if(car instanceof Car){
                System.out.println(car);
            }
        }
        }
    }




















