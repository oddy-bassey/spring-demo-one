package BeanLifeCycle;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut(){
        return "Run a hard 5K.!";
    }

    @Override
    public String getDailyFortune() {
        return "I'm waiting: "+fortuneService.getFortune();
    }
    //Defining methods to illustrate init and destroy methods
    
    //add an init method
    public void doMyStartupStuff(){
        System.out.println("running startup method");
    }
    
    //add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("running cleanup method");
    }
}
