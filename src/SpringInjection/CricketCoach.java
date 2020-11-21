package SpringInjection;
 
public class CricketCoach implements Coach{
    
    //add a fortune service 
    private FortuneService fortuneService;
    
    //add a varriable for eamail and team
    private String emailAddress;
    private String team;
    
    public CricketCoach(){
        System.out.println("Cricket Coach");
    }

    public void setEmailAddress(String emialAddress) {
        this.emailAddress = emialAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }                      
    
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("We the best.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "I'm new and i will succeed in life";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
