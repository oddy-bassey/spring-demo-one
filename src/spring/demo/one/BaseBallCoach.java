package spring.demo.one;

public class BaseBallCoach implements Coach {
    
    @Override
    public String getDailyWorkOut(){
        return "Spend 30min on batting practice.!";
    }
}
