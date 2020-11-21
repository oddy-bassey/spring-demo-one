package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        
        //creating the spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve beans from container
        Coach theCoach = context.getBean("MyCoach", Coach.class);
        
        Coach theCoach1 = context.getBean("MyCoach", Coach.class);
        
        SnookerPlayer snooker = context.getBean("Snooker", SnookerPlayer.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(snooker.chooseShot());
        
        boolean value = (theCoach==theCoach1);
        
        System.out.println("same bean object? : "+value);
        
        //close the context
        context.close();
    }
}
