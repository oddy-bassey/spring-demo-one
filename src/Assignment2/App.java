package Assignment2;

import java.util.Random;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("assignment2ApplicationContext.xml");
        
        TennisCoach coach = context.getBean("coach", TennisCoach.class);
        coach.getDailyWorkout();
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        System.out.println("coach car"+coach.getMultiFortuneServices());
        
        context.close();
    }
}
