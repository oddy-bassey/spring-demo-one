package SpringInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        
        //creating the spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_1.xml");
        
        //retrieve beans from container
        CricketCoach theCoach = context.getBean("MyCoach", CricketCoach.class);
        CricketCoach theCoach1 = context.getBean("MyCoach", CricketCoach.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkOut());
        
        //call methods for the fortune service
        System.out.println(theCoach.getDailyFortune());
        
        //call the methods to get eamil and team
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        
        boolean value = (theCoach==theCoach1);
        
        System.out.println("same bean object? : "+value);
        
        //close the context
        context.close();
    }
}
