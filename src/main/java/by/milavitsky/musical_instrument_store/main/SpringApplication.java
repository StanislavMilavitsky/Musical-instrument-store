package by.milavitsky.musical_instrument_store.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Cont
public class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
             "applicationContext.xml"
        );

    }
}
