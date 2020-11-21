package SpringScopes;

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
}
