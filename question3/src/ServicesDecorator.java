interface aService{
    void getRide();
}

class rideService implements aService{
    public void getRide(){
        System.out.println("Getting car service");
    }
}

abstract class ServiceDecorator implements aService{

    protected aService decoratedRide;

    public ServiceDecorator(aService decoratedRide){
        this.decoratedRide = decoratedRide;
    }

    @Override
    public void getRide(){
        decoratedRide.getRide();
    }

    
    public void additionalService(){

    }


}

class carEats extends ServiceDecorator{
    public carEats(aService decoratedRide){
        super(decoratedRide);
    }

    @Override
    public void getRide(){
        super.getRide();
    }

    public void orderFood(){
        System.out.println("Ordering food service");
    }
}

class carGo extends ServiceDecorator{
    public carGo(aService decoratedRide){
        super(decoratedRide);
    }

    @Override
    public void getRide(){
        super.getRide();
    }

    public void hatchbackRide(){
        System.out.println("Requesting hatchback ride");
    }
}

public class ServicesDecorator{
    public static void main(String[] args){
        System.out.println("Base ride service:");
        rideService baseRide = new rideService();
        baseRide.getRide();

        System.out.println("Car Eats services:");
        carEats newCarEats = new carEats(baseRide);
        newCarEats.getRide();
        newCarEats.orderFood();

        System.out.println("Car Go services:");
        carGo newCarGo = new carGo(baseRide);
        newCarGo.getRide();
        newCarGo.hatchbackRide();
    }
}