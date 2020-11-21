package BeanLifeCycle;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopDemoApp {
    public static void main(String[] args){
        
        //creating the spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle-ApplicationContext.xml");
        
        //retrieve beans from container
        Coach theCoach = context.getBean("coach", TrackCoach.class);
        
        Coach alphaCoach = context.getBean("coach", TrackCoach.class);
        
        boolean result = (theCoach == alphaCoach);
         
        System.out.println("\nARe they pointing to the same object?--"+result);
         
        System.out.println("\nMemory location for theCoach: "+theCoach);
        
        System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
         
        //close the context
        context.close();
    }
}
