package Assignment2;

import java.util.Random;

public class MultiFortuneServices implements FortuneService{

    @Override
    public String getFortuneService() {
        String[] fortune = {"mercedies bense", "bentley", "audi", "porche", "lamboginee", "avalon", "volvo"};
        Random random = new Random();
        
        return fortune[random.nextInt(6)];
    }
    
}
