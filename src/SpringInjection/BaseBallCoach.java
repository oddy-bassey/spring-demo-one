package SpringInjection;


public class BaseBallCoach implements Coach {
    
    //define a private field for depen
    private FortuneService fortuneService;
    
    public BaseBallCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkOut(){
        return "Spend 30min on batting practice.!";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: "+fortuneService.getFortune();
    }
}
