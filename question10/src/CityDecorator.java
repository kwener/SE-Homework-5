package question10.src;

interface Service{
    void getRide();
 }
 
 
 class rideService implements Service{
    public void getRide(){
        System.out.println("Getting car service");
    }
 }
 
 
 abstract class CityServiceDecorator implements Service{
 
 
    protected Service decoratedCityService;
 
 
    public CityServiceDecorator(Service decoratedVityService){
        this.decoratedCityService = decoratedVityService;
    }
 
 
    @Override
    public void getRide(){
        decoratedCityService.getRide();
    }
 
 
 
 
 }
 
 
 class LAService extends CityServiceDecorator{
    public LAService(Service decoratedRide){
        super(decoratedRide);
    }
 
 
    @Override
    public void getRide(){
        super.getRide();
    }
 
 
    public void orderLimo(){
        System.out.println("In LA, ordering a Limo");
    }
 }
 
 
 class AspenService extends CityServiceDecorator{
    public AspenService(Service decoratedRide){
        super(decoratedRide);
    }
 
 
    @Override
    public void getRide(){
        super.getRide();
    }
 
 
    public void snowRide(){
        System.out.println("In Aspen, ordering certified snow safe vehicle");
    }
 }
 
 
 
 
 public class CityDecorator{
    public static void main(String[] args){
        System.out.println("Base ride service:");
        rideService baseRide = new rideService();
        baseRide.getRide();
    }
}